package com.taula.core.taula.state;

import com.taula.core.taula.Game;
import com.taula.core.taula.Player;
import com.taula.core.taula.command.GameCommand;
import com.taula.core.taula.state.visitor.UnrolledStateVisitor;


public class UnrolledState extends BaseGameState {
    private final Player player;

    public UnrolledState(Game game, Player player) {
        super(game);

        this.player = player;
    }

    @Override
    public void execute(Game game, GameCommand command) {
        command.accept(new UnrolledStateVisitor(this));
    }

    public Player getPlayer() {
        return player;
    }
}
