package com.taula.core.taula.state;

import com.taula.core.taula.Game;
import com.taula.core.taula.Player;
import com.taula.core.taula.command.GameCommand;


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
