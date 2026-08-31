# Chain of Responsibility — `handlerchain` (sequential pipeline)

Full write-up: [`docs/behavioral/chain-of-responsibility.md`](../../../../../../../../../docs/behavioral/chain-of-responsibility.md)

## Structure

Every handler gets a turn, in order, like a filter/middleware chain — a
failure at any stage aborts the whole chain rather than letting a later
stage take over.

| Class | Checks |
|---|---|
| `RequestValidationHandler` | request isn't null |
| `ActiveAccountHandler` | account is active |
| `PaymentValidationHandler` | amount and account number |
| `PaymentPipelineFactory` | wires `RequestValidation → ActiveAccount → PaymentValidation` |

## Try it

Paste into `PatternVaultApplication.main(...)`:

```java
import com.prep.pattern_vault.behavioral.chainofresponsibility.handlerchain.*;

import java.util.UUID;

PaymentSupportHandler chain = new PaymentPipelineFactory().constructChain();
chain.handle(new PaymentRequest(UUID.randomUUID(), "acct-1", 42.0, true));
// runs every stage; throws IllegalArgumentException if any stage's check fails
```
