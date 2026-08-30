package com.prep.pattern_vault.behavioral.command.undoables;

import java.util.ArrayDeque;
import java.util.Deque;

public class CommandHistory {

    private final Deque<UndoableCommand> history =
            new ArrayDeque<>();

    public void execute(UndoableCommand command) {
        command.execute();
        history.push(command);
    }

    public void undoLast() {
        if (!history.isEmpty()) {
            history.pop().undo();
        }
    }
}