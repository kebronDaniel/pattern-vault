# Adapter (object adapter)

Full write-up: [`docs/structural/adapter.md`](../../../../../../../../docs/structural/adapter.md)

## Structure

| Role | Class |
|---|---|
| Target interface | `ShippingGateway` |
| Client | `ShippingService` |
| Adaptee (incompatible interface) | `QuickShipClient` |
| Adapter | `QuickShipAdapter` — bridges kg→g and cents→decimal |

## Try it

Paste into `PatternVaultApplication.main(...)`:

```java
import com.prep.pattern_vault.structural.adapter.*;

import java.math.BigDecimal;

ShippingGateway gateway = new QuickShipAdapter(new QuickShipClient());
ShippingService service = new ShippingService(gateway);

ShippingQuote quote = service.calculate(new Shipment("US", "DE", BigDecimal.valueOf(2.5)));
System.out.println(quote); // ShippingQuote[price=12.99, currency=EUR, estimatedDays=3]
```
