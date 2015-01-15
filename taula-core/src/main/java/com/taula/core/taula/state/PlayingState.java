package com.taula.core.taula.state;

import java.util.ArrayDeque;
import java.util.Deque;

import com.taula.core.Roll;
import com.taula.core.taula.CommandResult;
import com.taula.core.taula.Game;
import com.taula.core.taula.Player;
import com.taula.core.taula.command.GameCommand;
import com.taula.core.taula.state.visitor.PlayingStateVisitor;


public class PlayingState extends BaseGameState {
    private final Player player;
    private final Roll roll;
    private final Deque<CommandResult> results;

    public PlayingState(Game game, Player player, Roll roll) {
        super(game);

        this.player = player;
        this.roll = roll;
        this.results = new ArrayDeque<>();
    }

    @Override
    public void execute(Game game, GameCommand command) {
        command.accept(new PlayingStateVisitor(this));
    }

    public Player getPlayer() {
        return player;
    }

    public Roll getRoll() {
        return roll;
    }

    public void push(CommandResult result) {
        results.push(result);
    }

    private void undo() {
        CommandResult result = results.pop();

        if(result != null) {
            result.undo(getGame());
        }
    }

    public Deque<CommandResult> getResults() {
        return results;
    }
}
