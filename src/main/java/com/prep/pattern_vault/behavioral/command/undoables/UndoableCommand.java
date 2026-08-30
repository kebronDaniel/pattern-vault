package com.prep.pattern_vault.behavioral.command.undoables;

public interface UndoableCommand {
    void execute();
    void undo();
}
