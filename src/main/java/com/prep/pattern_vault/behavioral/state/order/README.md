# State — `order` (e-commerce order lifecycle)

Full write-up: [`docs/behavioral/state.md`](../../../../../../../../../docs/behavioral/state.md)

## Structure

| Role | Class |
|---|---|
| Context | `Order` — forwards `pay`/`ship`/`deliver`/`cancel`/`refund` to the current state |
| State interface | `OrderState` |
| Concrete states | `CreatedOrderState`, `PaidOrderState`, `ShippedOrderState`, `DeliveredOrderState`, `CancelledOrderState`, `RefundOrderState` |

Refund is only legal from `Paid` (cancel a paid order) or `Delivered` (a
return) — see the transition table in the full doc.

## Try it

Paste into `PatternVaultApplication.main(...)`:

```java
import com.prep.pattern_vault.behavioral.state.order.Order;

Order order = new Order();
order.pay();     // Created -> Paid
order.ship();    // Paid -> Shipped
order.deliver(); // Shipped -> Delivered
order.refund();  // Delivered -> Refund

System.out.println(order.getCurrentState()); // "REFUNDED"
```
