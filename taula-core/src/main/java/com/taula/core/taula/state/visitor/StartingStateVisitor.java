package com.taula.core.taula.state.visitor;

import com.taula.core.taula.state.StartingState;

/**
 * Created by hwilkins on 1/14/15.
 */
public class StartingStateVisitor extends StateCommandVisitor {
    private final StartingState state;

    public StartingStateVisitor(StartingState state) {
        this.state = state;
    }

//    private Player getWinningPlayer(Roll roll) {
//        if(roll.getDie1() > roll.getDie2()) {
//            return game.getPlayer1();
//        } else {
//            return game.getPlayer2();
//        }
//    }
}
