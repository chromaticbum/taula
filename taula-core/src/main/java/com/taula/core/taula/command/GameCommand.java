package com.taula.core.taula.command;


public interface GameCommand {
    void accept(CommandVisitor visitor);
}
