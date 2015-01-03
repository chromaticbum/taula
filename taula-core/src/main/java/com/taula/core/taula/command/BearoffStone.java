package com.taula.core.taula.command;


public class BearoffStone implements GameCommand {

    @Override
    public void accept(final CommandVisitor visitor) {
        visitor.visit(this);
    }
}
