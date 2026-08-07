package com.prep.pattern_valut.behavioral.command.undoables;

public interface UndoableCommand {
    void execute();
    void undo();
}
