package com.taula.core.taula;

import com.taula.core.Board;
import com.taula.core.taula.command.GameCommand;
import com.taula.core.taula.state.GameState;
import com.taula.core.taula.state.StartingState;


public class Game {
    private static final int DEFAULT_WIN_VALUE = 1;

    private final long id;
    private final Board board;
    private final Player player1;
    private final Player player2;
    private GameState state;
    private int winValue;

    public Game(long id, Board board) {
        this.id = id;
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

    public void doubleWinValue() {
        winValue *= 2;
    }

    public Player otherPlayer(Player player) {
        if      (player1 == player) return player2;
        else if (player2 == player) return player1;
        throw new IllegalArgumentException("invalid player");
    }
}