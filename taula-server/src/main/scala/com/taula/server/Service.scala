package com.taula.server

import java.util.concurrent.ConcurrentHashMap
import java.util.concurrent.atomic.AtomicLong

import com.taula.core.taula.Game


trait Service {
  def createGame(): Game
  def game(id: Long): Game
}

class ServiceImpl extends Service {
  private val id = new AtomicLong()
  private val games = new ConcurrentHashMap[Long, Game]()

  override def createGame(): Game = ???

  override def game(id: Long): Game = ???
}


