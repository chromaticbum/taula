package com.taula.core.taula.command;


public class RejectCube implements GameCommand {

    @Override
    public void accept(final CommandVisitor visitor) {
        visitor.visit(this);
    }
}
