package com.prep.pattern_vault.behavioral.command.undoables;

public class TextEditor {

    private final StringBuilder stringBuilder = new StringBuilder();

    public void append(String content){
        stringBuilder.append(content);
    }

    public void removeLast(int length){
        stringBuilder.delete(stringBuilder.length() - length, stringBuilder.length());
    }

    public String getContent(){
        if (stringBuilder.isEmpty()) return null;
        return stringBuilder.toString();
    }
}
