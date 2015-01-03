package com.taula.core.taula.command;


public interface CommandVisitor {
    void visit(AcceptCube cmd);
    void visit(BearoffStone cmd);
    void visit(EndTurn cmd);
    void visit(MoveStone cmd);
    void visit(OfferCube cmd);
    void visit(RejectCube cmd);
    void visit(RollDice cmd);
    void visit(Start cmd);
    void visit(Undo cmd);
}
