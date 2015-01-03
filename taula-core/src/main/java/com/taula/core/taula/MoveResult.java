package com.taula.core.taula;

import com.taula.core.taula.command.MoveStone;


public class MoveResult implements CommandResult {
    private final Player player;
    private final MoveStone move;

    public MoveResult(Player player, MoveStone move) {
        this.player = player;
        this.move = move;
    }

    @Override
    public void undo(Game game) {
    }
}
