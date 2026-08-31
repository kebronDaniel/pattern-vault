# Observer

Full write-up: [`docs/behavioral/observer.md`](../../../../../../../../docs/behavioral/observer.md)

## Structure

| Role | Class |
|---|---|
| Subject | `UserEventPublisher` |
| Observer interface | `UserRegistrationListener` |
| Concrete observers | `WelcomeEmailListener`, `AnalyticsListener`, `AuditLogListener`, `LoyaltyPointsListener` |
| Event payload | `UserRegisteredEvent` |
| Trigger | `UserRegistrationService` |

## Try it

Paste into `PatternVaultApplication.main(...)`:

```java
import com.prep.pattern_vault.behavioral.observer.*;

UserEventPublisher publisher = new UserEventPublisher();
publisher.register(new WelcomeEmailListener());
publisher.register(new AnalyticsListener());
publisher.register(new AuditLogListener());
publisher.register(new LoyaltyPointsListener());

UserRegistrationService service = new UserRegistrationService(publisher);
service.register("alice", "alice@example.com");
// -> all four listeners fire, in registration order
```
