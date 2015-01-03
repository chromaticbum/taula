package com.taula.core.taula.command;


public class Start implements GameCommand {

    @Override
    public void accept(final CommandVisitor visitor) {
        visitor.visit(this);
    }
}
