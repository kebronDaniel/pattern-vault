# Builder

Full write-up: [`docs/creational/builder.md`](../../../../../../../../docs/creational/builder.md)

## Structure

Classic Joshua Bloch builder: `Order.Builder` is a `public static final class`
nested inside `Order`, whose own constructor is `private`. Required fields
are constructor parameters on `Builder`; optional fields are fluent setters
with defaults, each returning `this`.

| Class | Role |
|---|---|
| `Order` | the immutable product |
| `Order.Builder` | nested builder — `couponCode`, `customerNote`, `expressDelivery`, `giftWrap`, `currency` |
| `Address`, `OrderItem` | supporting value records |

## Try it

Paste into `PatternVaultApplication.main(...)`:

```java
import com.prep.pattern_vault.creational.builder.*;

import java.math.BigDecimal;
import java.util.List;

List<OrderItem> items = List.of(new OrderItem("SKU-1", 2, BigDecimal.valueOf(19.99)));
Address address = new Address("1 Main St", "Springfield", "00000", "US");

Order order = new Order.Builder("cust-42", items, address, BigDecimal.valueOf(39.98))
        .expressDelivery(true)
        .giftWrap(true)
        .currency("USD")
        .build();

System.out.println(order.getItems());
```
