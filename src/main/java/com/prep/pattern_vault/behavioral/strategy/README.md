# Strategy

Full write-up: [`docs/behavioral/strategy.md`](../../../../../../../../docs/behavioral/strategy.md)

## Structure

| Role | Class |
|---|---|
| Strategy interface | `NotificationStrategy` |
| Concrete strategies | `EmailNotificationService`, `SmsNotificationService` |
| Resolver | `NotificationServiceRegistry` — normally Spring-populated; built by hand below |

## Try it

Paste into `PatternVaultApplication.main(...)` (the `@Component`s are
constructed directly here — no Spring context needed to try the pattern
mechanics):

```java
import com.prep.pattern_vault.behavioral.strategy.*;

import java.util.List;

NotificationServiceRegistry registry = new NotificationServiceRegistry(
        List.of(new EmailNotificationService(), new SmsNotificationService()));

NotificationStrategy strategy = registry.resolveStrategy(NotificationType.EMAIL);
strategy.send("someone@example.com", "your order shipped");
```
