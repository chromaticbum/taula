package com.taula.core.taula.command;


public class MoveStone implements GameCommand {

    @Override
    public void accept(final CommandVisitor visitor) {
        visitor.visit(this);
    }
}
