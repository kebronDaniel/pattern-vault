package com.prep.pattern_valut;


import com.prep.pattern_valut.behavioral.command.basicWithReturnType.*;
import com.prep.pattern_valut.behavioral.command.undoables.AppendTextCommand;
import com.prep.pattern_valut.behavioral.command.undoables.TextEditor;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PatternValutApplication {

	public static void main(String[] args) {

		// undoable
		TextEditor textEditor = new TextEditor();
		AppendTextCommand appendTextCommand = new AppendTextCommand(textEditor);
		appendTextCommand.setText("Test");
		appendTextCommand.execute();
		System.out.println("Content:" + textEditor.getContent());
		appendTextCommand.undo();
		System.out.println("Content:" + textEditor.getContent());
		appendTextCommand.execute();
		System.out.println("Content:" + textEditor.getContent());
		appendTextCommand.setText("new content");
		appendTextCommand.execute();
		System.out.println("Content:" + textEditor.getContent());
	}

}
