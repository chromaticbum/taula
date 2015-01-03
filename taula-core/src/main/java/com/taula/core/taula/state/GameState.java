package com.taula.core.taula.state;

import com.taula.core.taula.command.GameCommand;


public interface GameState {
    GameState execute(GameCommand command);
}
