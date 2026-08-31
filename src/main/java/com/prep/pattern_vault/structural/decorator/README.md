# Decorator

Full write-up: [`docs/structural/decorator.md`](../../../../../../../../docs/structural/decorator.md)

## Structure

| Role | Class |
|---|---|
| Component interface | `FileStorage` |
| Concrete component | `LocalFileStorage` |
| Base decorator | `FileStorageDecorator` |
| Concrete decorators | `LoggingFileStorageDecorator`, `CompressorFileStorageDecorator`, `EncryptingFileStorageDecorator` |

Stack order matters — compress before encrypt, since compressing
already-encrypted bytes finds far less redundancy to squeeze out.

## Try it

Paste into `PatternVaultApplication.main(...)`:

```java
import com.prep.pattern_vault.structural.decorator.*;

FileStorage storage = new LoggingFileStorageDecorator(
        new EncryptingFileStorageDecorator(
                new CompressorFileStorageDecorator(
                        new LocalFileStorage())));

String path = storage.store("report.csv", "col1,col2\n1,2".getBytes());
System.out.println(path);
```
