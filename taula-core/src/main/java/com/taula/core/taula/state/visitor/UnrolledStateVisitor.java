package com.taula.core.taula.state.visitor;

import com.taula.core.taula.state.UnrolledState;

/**
 * Created by hwilkins on 1/14/15.
 */
public class UnrolledStateVisitor extends StateCommandVisitor {
    private final UnrolledState state;

    public UnrolledStateVisitor(UnrolledState state) {
        this.state = state;
    }

//    @Override
//    public GameState execute(GameCommand command) {
//        if(command instanceof RollDice) {
//            return new PlayingState(game, player, new Roll());
//        } else if(command instanceof OfferCube) {
//            if(canOfferCube()) {
//                return new CubeState(game, player);
//            }
//        }
//
//        throw new IllegalStateException();
//    }
//
//    private boolean canOfferCube() {
//        // TODO: check to make sure we can offer the cube
//        return true;
//    }
}
