package com.taula.core.taula;

import com.taula.core.taula.game_command.BearoffStone;

/**
 * Created by hwilkins on 12/25/14.
 */
public class BearoffResult implements CommandResult {
    private final Player player;
    private final BearoffStone bearoff;

    public BearoffResult(Player player, BearoffStone bearoff) {
        this.player = player;
        this.bearoff = bearoff;
    }

    @Override
    public void undo(Game game) {
    }
}
