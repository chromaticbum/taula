package com.taula.core.taula.state.visitor;

import com.taula.core.taula.command.AcceptCube;
import com.taula.core.taula.command.BearoffStone;
import com.taula.core.taula.command.CommandVisitor;
import com.taula.core.taula.command.EndTurn;
import com.taula.core.taula.command.MoveStone;
import com.taula.core.taula.command.OfferCube;
import com.taula.core.taula.command.RejectCube;
import com.taula.core.taula.command.RollDice;
import com.taula.core.taula.command.Start;
import com.taula.core.taula.command.Undo;


abstract class StateCommandVisitor implements CommandVisitor {
    @Override
    public void visit(final AcceptCube cmd) {
        throw new IllegalStateException();
    }

    @Override
    public void visit(final BearoffStone cmd) {
        throw new IllegalStateException();
    }

    @Override
    public void visit(final EndTurn cmd) {
        throw new IllegalStateException();
    }

    @Override
    public void visit(final MoveStone cmd) {
        throw new IllegalStateException();
    }

    @Override
    public void visit(final OfferCube cmd) {
        throw new IllegalStateException();
    }

    @Override
    public void visit(final RejectCube cmd) {
        throw new IllegalStateException();
    }

    @Override
    public void visit(final RollDice cmd) {
        throw new IllegalStateException();
    }

    @Override
    public void visit(final Start cmd) {
        throw new IllegalStateException();
    }

    @Override
    public void visit(final Undo cmd) {
        throw new IllegalStateException();
    }
}
