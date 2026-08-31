# Simple Factory

Full write-up: [`docs/creational/factory.md`](../../../../../../../../docs/creational/factory.md)

## Structure

| Role | Class |
|---|---|
| Product interface | `DocumentStorage` |
| Concrete products | `LocalDocumentStorage`, `S3DocumentStorage`, `DbDocumentStorage` |
| Creation dispatch | `StorageType` (enum with a constant-specific `create()` body per constant) |
| Factory | `DocumentStorageFactory` |
| Client | `DocumentService` |

## Try it

Paste into `PatternVaultApplication.main(...)`:

```java
import com.prep.pattern_vault.creational.factory.*;

DocumentService service = new DocumentService(new DocumentStorageFactory());
String location = service.upload(StorageType.S3, new Document("report.pdf", "hello".getBytes()));
System.out.println(location);

// swap the enum constant, nothing else about the call site changes
String localLocation = service.upload(StorageType.LOCAL, new Document("notes.txt", "hi".getBytes()));
System.out.println(localLocation);
```
