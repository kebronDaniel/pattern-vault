package com.prep.pattern_valut.behavioral.command.undoables;

public class AppendTextCommand implements UndoableCommand {

    private final TextEditor textEditor;
    private boolean executed;
    private String text;

    public AppendTextCommand(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void execute() {
        if (!executed && text != null){
            textEditor.append(this.text);
            this.executed = true;
        }
    }

    @Override
    public void undo() {
        textEditor.removeLast(text.length());
        this.executed = false;
        this.text = null;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
