package com.taula.core.taula;

import com.taula.core.Board;
import com.taula.core.taula.game_command.GameCommand;
import com.taula.core.taula.game_command.MoveStone;
import com.taula.core.taula.game_state.GameState;
import com.taula.core.taula.game_state.StartingState;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by hwilkins on 12/25/14.
 */
public class Game {
    public static final int DEFAULT_WIN_VALUE = 1;

    private final Board board;
    private final Player player1;
    private final Player player2;
    private GameState state;
    private int winValue;

    public Game(Board board) {
        this.board = board;
        this.player1 = new Player();
        this.player2 = new Player();
        this.state = new StartingState(this);
        this.winValue = DEFAULT_WIN_VALUE;
    }

    public Player getPlayer1() {
        return player1;
    }

    public Player getPlayer2() {
        return player2;
    }

    public void execute(GameCommand command) {
        state = state.execute(command);
    }

    public int doubleWinValue() {
        winValue *= 2;

        return winValue;
    }

    public Player otherPlayer(Player player) {
        if(player1 == player) {
            return player2;
        } else if(player2 == player) {
            return player1;
        }

        return null;
    }
}