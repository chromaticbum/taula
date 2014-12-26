package com.taula.core.taula.game_state;

import com.taula.core.taula.Game;
import com.taula.core.taula.Player;
import com.taula.core.taula.game_command.GameCommand;

/**
 * Created by hwilkins on 12/25/14.
 */
public class EndState extends BaseGameState {
    private final Player player;

    public EndState(Game game, Player player) {
        super(game);

        this.player = player;
    }

    @Override
    public GameState execute(GameCommand command) {
        throw new IllegalStateException();
    }
}
