package com.taula.core.protocol;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import com.taula.core.taula.command.GameCommand;


public class Message {
    private final long gameId;
    private final GameCommand cmd;

    public Message(long gameId, GameCommand cmd) {
        this.gameId = gameId;
        this.cmd = cmd;
    }

    public void serialize(DataOutput out) throws IOException {

    }

    public static Message deserialize(DataInput in) throws IOException {
        return null;
    }
}
