package com.taula.core.taula.command;


public class AcceptCube implements GameCommand {

    @Override
    public void accept(final CommandVisitor visitor) {
        visitor.visit(this);
    }
}
