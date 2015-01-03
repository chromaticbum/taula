package com.taula.core.taula.state;

import com.taula.core.taula.Game;
import com.taula.core.taula.Player;
import com.taula.core.taula.command.AcceptCube;
import com.taula.core.taula.command.GameCommand;
import com.taula.core.taula.command.RejectCube;


public class CubeState extends BaseGameState {
    // Player who offered the cube
    private final Player player;

    public CubeState(Game game, Player player) {
        super(game);

        this.player = player;
    }

    @Override
    public GameState execute(GameCommand command) {
        if(command instanceof AcceptCube) {
            game.doubleWinValue();

            return new UnrolledState(game, player);
        } else if(command instanceof RejectCube) {
            return new EndState(game, player);
        }

        throw new IllegalStateException();
    }
}
