package com.taula.core.taula.state.visitor;

import com.taula.core.taula.state.EndState;

/**
 * Created by hwilkins on 1/14/15.
 */
public class EndStateVisitor extends StateCommandVisitor {
    private final EndState state;

    public EndStateVisitor(EndState state) {
        this.state = state;
    }
}
