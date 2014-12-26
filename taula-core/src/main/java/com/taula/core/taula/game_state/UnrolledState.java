package com.taula.core.taula.game_state;

import com.taula.core.Roll;
import com.taula.core.taula.Game;
import com.taula.core.taula.Player;
import com.taula.core.taula.game_command.GameCommand;
import com.taula.core.taula.game_command.OfferCube;
import com.taula.core.taula.game_command.RollDice;

/**
 * Created by hwilkins on 12/25/14.
 */
public class UnrolledState extends BaseGameState {
    private final Player player;

    public UnrolledState(Game game, Player player) {
        super(game);

        this.player = player;
    }

    @Override
    public GameState execute(GameCommand command) {
        if(command instanceof RollDice) {
            return new PlayingState(game, player, new Roll());
        } else if(command instanceof OfferCube) {
            if(canOfferCube()) {
                return new CubeState(game, player);
            }
        }

        throw new IllegalStateException();
    }

    private boolean canOfferCube() {
        // TODO: check to make sure we can offer the cube
        return true;
    }
}
