# Command — `basicwithreturntype` (command with a return value)

Full write-up: [`docs/behavioral/command.md`](../../../../../../../../../docs/behavioral/command.md)

## Structure

| Role | Class |
|---|---|
| Command interface (`R execute()`) | `Command<R>` |
| Concrete commands | `SendMailCommand`, `ReportGeneratorCommand` |
| Invoker | `CommandQueue` — queues a mixed `Command<?>` list, collects results |

## Try it

Paste into `PatternVaultApplication.main(...)`:

```java
import com.prep.pattern_vault.behavioral.command.basicwithreturntype.*;
import com.prep.pattern_vault.behavioral.command.basicwithreturntype.mail.MailService;
import com.prep.pattern_vault.behavioral.command.basicwithreturntype.report.ReportGenerator;

import java.util.List;

CommandQueue queue = new CommandQueue();
queue.submitCommand(new SendMailCommand(new MailService(), new SendMailRequest("a@x.com", "b@x.com", "hi")));
queue.submitCommand(new ReportGeneratorCommand(new ReportGenerator()));

List<Object> results = queue.executeAll();
System.out.println(results); // ["Email sent successfully", null]
```
