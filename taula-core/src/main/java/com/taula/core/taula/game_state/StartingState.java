package com.taula.core.taula.game_state;

import com.taula.core.Roll;
import com.taula.core.taula.Game;
import com.taula.core.taula.Player;
import com.taula.core.taula.game_command.GameCommand;
import com.taula.core.taula.game_command.Start;

/**
 * Created by hwilkins on 12/25/14.
 */
public class StartingState extends BaseGameState {
    public StartingState(Game game) {
        super(game);
    }

    @Override
    public GameState execute(GameCommand command) {
        if(command instanceof Start) {
            Roll roll = Roll.uniqueRoll();
            Player winner = getWinningPlayer(roll);

            return new PlayingState(this.game, winner, roll);
        }

        throw new IllegalStateException();
    }

    private Player getWinningPlayer(Roll roll) {
        if(roll.getDie1() > roll.getDie2()) {
            return game.getPlayer1();
        } else {
            return game.getPlayer2();
        }
    }
}
