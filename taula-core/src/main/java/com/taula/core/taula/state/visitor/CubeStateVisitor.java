package com.taula.core.taula.state.visitor;

import com.taula.core.taula.command.AcceptCube;
import com.taula.core.taula.command.RejectCube;
import com.taula.core.taula.state.CubeState;

/**
 * Created by hwilkins on 1/14/15.
 */
public class CubeStateVisitor extends StateCommandVisitor {
    private final CubeState state;

    public CubeStateVisitor(CubeState state) {
        this.state = state;
    }

    @Override
    public void visit(AcceptCube cmd) {
    }

    @Override
    public void visit(RejectCube cmd) {
    }

//    @Override
//    public GameState execute(GameCommand command) {
//        if(command instanceof AcceptCube) {
//            game.doubleWinValue();
//
//            return new UnrolledState(game, player);
//        } else if(command instanceof RejectCube) {
//            return new EndState(game, player);
//        }
//
//        throw new IllegalStateException();
//    }
}
