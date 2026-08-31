# Proxy (protection proxy)

Full write-up: [`docs/structural/proxy.md`](../../../../../../../../docs/structural/proxy.md)

## Structure

| Role | Class |
|---|---|
| Subject interface | `BankAccountService` |
| Real subject | `CoreBankAccountService` |
| Proxy | `SecuredBankAccountService` — checks access, then delegates |

Access policy: `ADMIN` → any account, `CUSTOMER` → only their own account,
`SUPPORT` → always denied.

## Try it

Paste into `PatternVaultApplication.main(...)`:

```java
import com.prep.pattern_vault.structural.proxy.*;
import com.prep.pattern_vault.structural.proxy.dto.BankAccount;
import com.prep.pattern_vault.structural.proxy.dto.User;

import java.math.BigDecimal;

BankAccountRepository repository = new BankAccountRepository();
repository.save(new BankAccount("acc-1", "cust-1", BigDecimal.valueOf(500)));

BankAccountService realService = new CoreBankAccountService(repository);
BankAccountService securedService = new SecuredBankAccountService(repository, realService);

User owner = new User("cust-1", Role.CUSTOMER);
System.out.println(securedService.deposit("acc-1", BigDecimal.TEN, owner)); // balance 510

User stranger = new User("cust-2", Role.CUSTOMER);
securedService.deposit("acc-1", BigDecimal.TEN, stranger); // throws AccessDeniedException
```
