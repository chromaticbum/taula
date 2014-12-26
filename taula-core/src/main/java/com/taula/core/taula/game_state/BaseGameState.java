package com.taula.core.taula.game_state;

import com.taula.core.taula.Game;

/**
 * Created by hwilkins on 12/25/14.
 */
public abstract class BaseGameState implements GameState {
    final Game game;

    public BaseGameState(Game game) {
        this.game = game;
    }
}
