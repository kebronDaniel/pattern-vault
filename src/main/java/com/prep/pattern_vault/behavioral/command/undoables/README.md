# Command — `undoables` (undoable text editing)

Full write-up: [`docs/behavioral/command.md`](../../../../../../../../../docs/behavioral/command.md)

## Structure

| Role | Class |
|---|---|
| Command interface (`execute()` + `undo()`) | `UndoableCommand` |
| Concrete command | `AppendTextCommand` |
| Invoker (LIFO undo stack) | `CommandHistory` |
| Receiver | `TextEditor` |

## Try it

Paste into `PatternVaultApplication.main(...)`:

```java
import com.prep.pattern_vault.behavioral.command.undoables.*;

TextEditor editor = new TextEditor();
CommandHistory history = new CommandHistory();

AppendTextCommand append = new AppendTextCommand(editor);
append.setText("hello");

history.execute(append);
System.out.println(editor.getContent()); // "hello"

history.undoLast();
System.out.println(editor.getContent()); // null — back to empty
```
