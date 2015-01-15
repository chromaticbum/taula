package com.taula.core.taula.state;

import com.taula.core.taula.Game;
import com.taula.core.taula.Player;
import com.taula.core.taula.command.GameCommand;
import com.taula.core.taula.state.visitor.CubeStateVisitor;


public class CubeState extends BaseGameState {
    // Player who offered the cube
    private final Player player;

    public CubeState(Game game, Player player) {
        super(game);

        this.player = player;
    }

    @Override
    public void execute(Game game, GameCommand command) {
        command.accept(new CubeStateVisitor(this));
    }

    public Player getPlayer() {
        return player;
    }
}
