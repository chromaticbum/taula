package com.taula.core.taula.state;

import com.taula.core.taula.Game;
import com.taula.core.taula.command.GameCommand;


public interface GameState {
    void execute(Game game, GameCommand command);
}
