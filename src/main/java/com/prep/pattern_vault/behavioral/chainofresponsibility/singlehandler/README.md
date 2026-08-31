# Chain of Responsibility — `singlehandler` (first-match dispatch)

Full write-up: [`docs/behavioral/chain-of-responsibility.md`](../../../../../../../../../docs/behavioral/chain-of-responsibility.md)

## Structure

Exactly one handler ever acts: each either fully handles the request and
stops the chain, or declines and passes it on untouched.

| Class | Owns severity |
|---|---|
| `BasicSupportHandler` | `LOW` |
| `TechnicalSupportHandler` | `MEDIUM` |
| `SeniorSupportHandler` | `HIGH` |
| `EmergencySupportHandler` | `CRITICAL` |
| `SupportEscalationFactory` | wires `Basic → Technical → Senior → Emergency` |

## Try it

Paste into `PatternVaultApplication.main(...)`:

```java
import com.prep.pattern_vault.behavioral.chainofresponsibility.singlehandler.*;

SupportHandler chain = new SupportEscalationFactory().constructChain();

SupportResult result = chain.handle(new SupportTicket("t-1", "cust-1", Severity.HIGH, "server is down"));
System.out.println(result); // resolved by SeniorSupportHandler

SupportResult basic = chain.handle(new SupportTicket("t-2", "cust-2", Severity.LOW, "how do I reset my password"));
System.out.println(basic); // resolved by BasicSupportHandler, never reaches the rest of the chain
```
