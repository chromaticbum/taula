package com.taula.core.taula.state;

import com.taula.core.taula.Game;
import com.taula.core.taula.command.GameCommand;
import com.taula.core.taula.state.visitor.StartingStateVisitor;


public class StartingState extends BaseGameState {
    public StartingState(Game game) {
        super(game);
    }

    @Override
    public void execute(Game game, GameCommand command) {
        command.accept(new StartingStateVisitor(this));
    }

//    @Override
//    public GameState execute(GameCommand command) {
//        if(command instanceof Start) {
//            Roll roll = Roll.uniqueRoll();
//            Player winner = getWinningPlayer(roll);
//
//            return new PlayingState(this.game, winner, roll);
//        }
//
//        throw new IllegalStateException();
//    }
}
