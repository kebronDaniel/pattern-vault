# Pattern Vault — Design Pattern Reference

This project is a hands-on catalogue of the classic Gang-of-Four (GoF) design
patterns, implemented in Java on top of a minimal Spring Boot skeleton. Each
pattern lives in its own package under `src/main/java/com/prep/pattern_vault`,
grouped by the standard three GoF categories: **creational**, **structural**,
and **behavioral**.

The goal of this documentation is to serve as reference material: for every
pattern you'll find the textbook intent, the structure/participants, how this
repo's implementation maps onto that structure, a usage example, and — where
relevant — a note on how this implementation deviates from (or is a variant
of) the canonical GoF form.

## How to build and test

```bash
./mvnw compile   # compile
./mvnw test      # run the test suite
```

## Index

### Creational

| Pattern | Package | Variant | Doc |
|---|---|---|---|
| Singleton | `creational.singleton` | eager-safe enum singleton + a lazy double-checked-style singleton | [singleton.md](creational/singleton.md) |
| Simple Factory | `creational.factory` | enum-dispatched simple factory | [factory.md](creational/factory.md) |
| Builder | `creational.builder` | classic (Joshua Bloch) builder | [builder.md](creational/builder.md) |

### Structural

| Pattern | Package | Variant | Doc |
|---|---|---|---|
| Adapter | `structural.adapter` | object adapter | [adapter.md](structural/adapter.md) |
| Decorator | `structural.decorator` | classic decorator stack | [decorator.md](structural/decorator.md) |
| Facade | `structural.facade` | unified facade over multiple subsystems | [facade.md](structural/facade.md) |
| Proxy | `structural.proxy` | protection proxy | [proxy.md](structural/proxy.md) |

### Behavioral

| Pattern | Package | Variant | Doc |
|---|---|---|---|
| Chain of Responsibility | `behavioral.chainofresponsibility.*` | validation pipeline (`handlerchain`) + first-match escalation chain (`singlehandler`) | [chain-of-responsibility.md](behavioral/chain-of-responsibility.md) |
| Command | `behavioral.command.*` | command with a return value (`basicwithreturntype`) + undoable command (`undoables`) | [command.md](behavioral/command.md) |
| Observer | `behavioral.observer` | classic publisher/subscriber | [observer.md](behavioral/observer.md) |
| State | `behavioral.state.*` | audio player state machine (`musicplayer`) + order lifecycle state machine (`order`) | [state.md](behavioral/state.md) |
| Strategy | `behavioral.strategy` | registry-resolved strategy (Spring-managed) | [strategy.md](behavioral/strategy.md) |
| Template Method | `behavioral.template` | report-generation skeleton | [template-method.md](behavioral/template-method.md) |

## Reading a pattern doc

Each doc follows the same shape:

1. **Intent** — the problem the pattern solves, in GoF terms.
2. **Structure** — the participants, as a diagram.
3. **This implementation** — how the repo's classes map onto those
   participants, with file references.
4. **Usage** — a short example of wiring the pieces together.
5. **Notes** — deviations from the canonical form, and trade-offs worth
   knowing before reaching for this pattern in a real system.
