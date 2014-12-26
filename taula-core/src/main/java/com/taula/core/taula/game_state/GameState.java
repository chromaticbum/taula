package com.taula.core.taula.game_state;

import com.taula.core.taula.game_command.GameCommand;

/**
 * Created by hwilkins on 12/25/14.
 */
public interface GameState {
    GameState execute(GameCommand command);
}
