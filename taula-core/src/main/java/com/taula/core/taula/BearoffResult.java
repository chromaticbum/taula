package com.taula.core.taula;

import com.taula.core.taula.command.BearoffStone;


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
