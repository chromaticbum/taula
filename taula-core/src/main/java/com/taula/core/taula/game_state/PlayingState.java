package com.taula.core.taula.game_state;

import com.taula.core.Roll;
import com.taula.core.taula.*;
import com.taula.core.taula.game_command.*;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by hwilkins on 12/25/14.
 */
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
    public GameState execute(GameCommand command) {
        if(command instanceof MoveStone) {
            MoveStone move = (MoveStone)command;

            if(validMove(move)) {
                this.move(move);
                return this;
            }
        } else if(command instanceof BearoffStone) {
            BearoffStone bearoff = (BearoffStone)command;

            if(validBearoff(bearoff)) {
                this.bearoff(bearoff);
                return this;
            }
        } else if(command instanceof Undo) {
            undo();
        } else if(command instanceof EndTurn) {
            if(canEndTurn()) {
                return endTurn();
            }
        }

        throw new IllegalStateException();
    }

    private void undo() {
        CommandResult result = results.pop();

        if(result != null) {
            result.undo(game);
        }
    }

    private CommandResult move(MoveStone move) {
        // TODO: Actually move the pieces on the board
        // Knockout any required pieces and store it
        // in the move result so it can be undone
        MoveResult result = new MoveResult(player, move);
        results.push(result);

        return result;
    }

    private boolean validMove(MoveStone move) {
        // TODO: run actual validations here
        return true;
    }

    private CommandResult bearoff(BearoffStone bearoff) {
        // TODO: actually bearoff the stone on the board
        BearoffResult result = new BearoffResult(player, bearoff);
        results.push(result);

        return result;
    }

    private boolean validBearoff(BearoffStone bearoff) {
        // TODO: run bearoff validations here
        return true;
    }

    private GameState endTurn() {
        // TODO: return EndState is the player has beared off all stones
        return new UnrolledState(game, game.otherPlayer(player));
    }

    private boolean canEndTurn() {
        // TODO: make sure we have used all of our roll
        return true;
    }
}
