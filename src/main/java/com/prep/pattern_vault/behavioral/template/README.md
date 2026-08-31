# Template Method

Full write-up: [`docs/behavioral/template-method.md`](../../../../../../../../docs/behavioral/template-method.md)

## Structure

| Role | Class |
|---|---|
| Template (algorithm skeleton, `generate()` is `final`) | `ReportGenerator` |
| Concrete subclasses (fill in the hooks) | `CsvReportGenerator`, `PdfReportGenerator` |
| Collaborators | `ReportRepository` (loads data), `ReportStorage` (persists the result) |

## Try it

Paste into `PatternVaultApplication.main(...)`:

```java
import com.prep.pattern_vault.behavioral.template.*;
import com.prep.pattern_vault.behavioral.template.dto.ReportRequest;
import com.prep.pattern_vault.behavioral.template.dto.ReportResult;

import java.time.LocalDate;

ReportGenerator csv = new CsvReportGenerator(new ReportStorage(), new ReportRepository());
ReportResult result = csv.generate(new ReportRequest("monthly-orders", LocalDate.now().minusDays(30), LocalDate.now()));
System.out.println(result); // location -> "/reports/monthly-orders.csv"
```
