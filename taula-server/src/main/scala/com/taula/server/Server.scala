package com.taula.server

import java.net.InetSocketAddress
import java.nio.ByteBuffer

import akka.actor.ActorSystem
import akka.stream.FlowMaterializer
import akka.stream.scaladsl.{  Flow, StreamTcp }
import akka.stream.stage.{ Context, StageState, StatefulStage }
import akka.util.ByteString

import scala.annotation.tailrec

class Server(addr: InetSocketAddress, system: ActorSystem, handler: Flow[ByteString, ByteString]) {

  implicit val sys = system
  implicit val fm = FlowMaterializer()

  def bind() {
    val binding = StreamTcp().bind(addr)
    binding.connections foreach { conn =>
      conn handleWith handler
    }
  }
}

object Server {

  def frame(data: ByteString) = {
    val buf = ByteBuffer.allocate(4)
    buf.putInt(data.size)
    buf.flip()
    ByteString(buf) ++ data
  }

  class Framer(headerSize: Int) extends StatefulStage[ByteString, ByteString] {
    var size = 0
    var buffer = ByteString.empty

    override def initial = new StageState[ByteString, ByteString] {
      override def onPush(elem: ByteString, ctx: Context[ByteString]) = {
        buffer ++= elem
        emit(doRead(Vector.empty).iterator, ctx)
      }

      @tailrec
      private def doRead(read: Vector[ByteString]): Vector[ByteString] = {
        if (size == 0 && buffer.size >= headerSize) {
          val (header, rest) = buffer splitAt headerSize
          size = header.asByteBuffer.getInt
          buffer = rest
        }
        if (size == 0 || buffer.size < size) read else {
          val (data, rest) = buffer splitAt size
          size = 0
          buffer = rest
          doRead(read :+ data)
        }
      }
    }
  }
}
