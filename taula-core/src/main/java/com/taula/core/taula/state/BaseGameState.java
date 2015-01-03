package com.taula.core.taula.state;

import com.taula.core.taula.Game;


public abstract class BaseGameState implements GameState {
    final Game game;

    public BaseGameState(Game game) {
        this.game = game;
    }
}
