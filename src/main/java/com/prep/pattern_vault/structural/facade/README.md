# Facade

Full write-up: [`docs/structural/facade.md`](../../../../../../../../docs/structural/facade.md)

## Structure

| Role | Class |
|---|---|
| Facade | `TravelBookingFacade` |
| Subsystems | `FlightService`, `HotelService`, `PaymentService`, `NotificationService` |
| Request/response | `TravelBookingRequest`, `TravelBookingResult` |

`bookTrip(...)` orchestrates all four subsystems in order, and rolls back
the flight/hotel reservations if payment fails.

## Try it

Paste into `PatternVaultApplication.main(...)`:

```java
import com.prep.pattern_vault.structural.facade.TravelBookingFacade;
import com.prep.pattern_vault.structural.facade.dto.TravelBookingRequest;
import com.prep.pattern_vault.structural.facade.dto.TravelBookingResult;

import java.math.BigDecimal;
import java.time.LocalDate;

TravelBookingFacade facade = new TravelBookingFacade();
TravelBookingRequest request = new TravelBookingRequest(
        "cust-1", "cust@example.com", "US", "UK",
        LocalDate.now(), LocalDate.now().plusDays(5), BigDecimal.valueOf(3000));

TravelBookingResult result = facade.bookTrip(request);
System.out.println(result);
```
