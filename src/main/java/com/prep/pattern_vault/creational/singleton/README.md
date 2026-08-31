# Singleton

Full write-up: [`docs/creational/singleton.md`](../../../../../../../../docs/creational/singleton.md)

## Structure

Two independent implementations of the same guarantee — exactly one instance,
one global access point:

| Class | Approach |
|---|---|
| `ResourceProvision` | enum singleton — instance created when the enum class loads |
| `ConfigDbConnection` | lazily-initialized singleton — `synchronized` + `volatile` guarded `getInstance()` |

## Try it

Paste into `PatternVaultApplication.main(...)`:

```java
import com.prep.pattern_vault.creational.singleton.ConfigDbConnection;
import com.prep.pattern_vault.creational.singleton.ResourceProvision;

ConfigDbConnection connection = ConfigDbConnection.getInstance();
ConfigDbConnection sameConnection = ConfigDbConnection.getInstance();
System.out.println(connection == sameConnection); // true — same instance

var resource = ResourceProvision.GET_RESOURCE;
var resource2 = ResourceProvision.GET_RESOURCE;
System.out.println(resource == resource2); // true
```
