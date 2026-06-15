<p align="center">
  <img src="https://img.shields.io/badge/Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white" alt="Kotlin"/>
  <img src="https://img.shields.io/badge/IntelliJ_IDEA-000000?style=for-the-badge&logo=intellij-idea&logoColor=white" alt="IntelliJ IDEA"/>
  <img src="https://img.shields.io/badge/JVM-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white" alt="JVM"/>
</p>

<h1 align="center">🚀 Kotlin Practice Lab</h1>

<p align="center">
  <strong>A structured, week-by-week deep dive into Kotlin — from first <code>println</code> to sealed-class state machines.</strong>
</p>

<p align="center">
  <code>24 programs</code> · <code>1 181 lines</code> · <code>4 weeks</code> · <code>17 sessions</code>
</p>

<p align="center">
  <a href="#-week-1--foundations">Week 1</a> •
  <a href="#-week-2--object-oriented-kotlin">Week 2</a> •
  <a href="#-week-3--functional--safety">Week 3</a> •
  <a href="#-week-4--data-mastery--type-safety">Week 4</a> •
  <a href="#-how-to-run">Run</a>
</p>

---

## ✨ What's Inside

Every folder is a self-contained IntelliJ IDEA module you can open and run instantly.  
The curriculum progresses from basic control flow to advanced type systems, each concept demonstrated with a **progressively complex exercises** — not toy snippets.

| Concept Area | Topics Covered |
|:---|:---|
| **Control Flow** | `when` expressions, `while` loops, ranges, user input |
| **Strings** | Templates, multiline strings, `split` / `join` / `replace` / `trim` |
| **OOP Foundations** | Classes, `data class`, constructors, `init` blocks, companion objects |
| **Inheritance** | `open` / `override`, polymorphic lists, `apply` scope function |
| **Abstraction** | Abstract classes, interfaces, contract-based design |
| **Null Safety** | `?.` safe calls, `?:` Elvis, `!!` assertion, `let`, `toIntOrNull()` |
| **Lambdas** | Lambda literals, function types, stored lambdas, lambdas as parameters |
| **Higher-Order Functions** | Custom `repeat`, custom `filter`, predicates, trailing lambdas |
| **Scope Functions** | `apply`, `let` — chained and nested |
| **Collections** | `List`, `MutableList`, `Set`, `MutableMap`, `find`, `removeIf`, `forEach` |
| **Data Classes** | `copy()`, destructuring declarations, structural equality, `vararg` |
| **Enum & Sealed Types** | `enum class`, `sealed class`, `sealed interface`, exhaustive `when` |
| **Collection Operations** | `sortedByDescending`, `mapIndexed`, `filter`, `joinToString`, `padEnd` |

---

## 📅 Week 1 — Foundations

> *Variables, control flow, strings, and the first interactive program.*

### Day 1 · Number Guessing Game

A console game powered by `while(true)`, `when` expressions, and `readln()` — the player guesses a random number between 1–100 with directional hints.

```kotlin
val secret = (1..100).random()
when {
    guess > secret -> println("You are too high")
    guess < secret -> println("You are too low")
    else -> { println("You guessed in $attempts attempts"); break }
}
```

### Day 2 · String Manipulation Suite

Three programs exploring Kotlin's string power:

| Program | Highlights |
|:---|:---|
| **String Operations** | `trim`, `uppercase`, `lowercase`, `contains`, `replace`, `substring` |
| **String Templates** | `$variable`, `${expression}`, multiline `""" """` with `trimIndent()` |
| **Word Processing** | `split`, `joinToString`, `replaceFirstChar`, `startsWith`, `last()` |

---

## 🏗 Week 2 — Object-Oriented Kotlin

> *Classes, inheritance hierarchies, abstraction, and a full Library Management System.*

### Day 1 · Classes & Data Classes

Introduction to `data class` with named / positional arguments and member functions.

```kotlin
data class excelStudent(var name: String, var marks: Int, var grade: String) {
    fun greet() {
        println("Hello $name, you scored $marks marks and $grade grade.")
    }
}
```

### Day 2 · Bank Account — Constructors & Init

Multiple constructors with `init` block initialization, demonstrating **constructor chaining** and banking operations (deposit, withdraw, balance check).

```kotlin
class bankAccount(val name: String) {
    init { println("Welcome $name to XYZ Bank") }

    constructor(name: String, age: Int): this(name) { ... }
    constructor(name: String, age: Int, bal: Int): this(name) { ... }
}
```

### Day 3 · Animal Inheritance Hierarchy

Polymorphism with `open` / `override`, the `apply` scope function, and iterating a `List<Animal>` with runtime type reflection via `::class.simpleName`.

```
🐕 A Dog named Rocky sounds Boww..
🐈 A Cat named Tom sounds Meow..
🐭 A Mouse named Jerry sounds squeaks and chirps..
```

### Day 4 · Abstract Classes & Interfaces

The same **Library borrowing system** implemented two ways to compare language constructs:

| Approach | Features Used |
|:---|:---|
| **Abstract Class** | `abstract fun`, `companion object` static borrow counter, concrete methods |
| **Interface** | Property declarations in interfaces, contract-only design, no state |

### Day 5 · Mini Library System 📚

The repo's first multi-class project — a full library management system with:
- `data class Book` with availability tracking
- `Member` class with borrow/return logic and borrowed-books list
- `Library` class with member registration and book catalog
- Edge-case handling: unavailable books, multiple borrow attempts, returns

---

## ⚡ Week 3 — Functional & Safety

> *Null safety, lambdas, higher-order functions, and progressive refactoring.*

### Day 1 · Null Safety — 5 Programs

A comprehensive null-safety showcase covering every operator:

| # | Program | Operators |
|:-:|:---|:---|
| 1 | User Profile Lookup | `?.let { }`, `?:` Elvis |
| 2 | Phone Book | Nullable `Map` values, `?:` in loops |
| 3 | Chain of Nulls | Nested `?.let` chaining across 3 nullables |
| 4 | The Intentional Crash | `!!` vs `?.` — safe vs unsafe |
| 5 | Safe Number Parser | `toIntOrNull()` → type-safe parsing |

### Day 2 · Lambda Expressions — 5 Programs

Lambdas from every angle:
- Lambda returning a square: `(Int) -> Int`
- Lambda as string validator: `(String) -> Boolean`
- Lambda comparing two ints: `(Int, Int) -> Int`
- Stored lambda with nullable parameter: `(String?) -> String`
- **Lambda passed as function argument** — higher-order preview

### Day 3 · Higher-Order Functions

Built from scratch — not wrappers around stdlib:

```kotlin
// Custom filter — how Kotlin's .filter() works under the hood
fun List<Int>.myFilter(predicate: (Int) -> Boolean): List<Int> {
    val ans = mutableListOf<Int>()
    for (i in this) { if (predicate(i)) ans.add(i) }
    return ans
}
```

Also includes: `repeatTwice`, `operator` (applies a lambda twice), `printMessage`, `processNumber`, `checkValue`, and a custom `repeat`.

### Day 4 · Bank Account v2 — Refactored

The Week 2 bank account rebuilt with **Week 3 knowledge**:
- Default/named parameters, `private set` backing properties
- Null-safe age display with `?.toString() ?: "Not Available"`

### Day 5 · Bank Account v3 — Fully Functional

The final evolution — now using **lambdas, higher-order functions, and scope functions**:

```kotlin
fun executeIfSufficient(amount: Int, action: () -> Unit) {
    if (balance >= amount) action() else println("Insufficient funds!")
}

fun deposit(amount: Int, onTransaction: (Int) -> Unit = {}) { ... }

// Usage with apply scope function
val ac1 = BankAccount("Krishna Chaitanya").apply {
    deposit(500); deposit(1000); withdraw(300); checkBalance()
}
```

---

## 🔷 Week 4 — Data Mastery & Type Safety

> *Collection operations, data class features, sealed hierarchies, and final projects.*

### Day 1 · Student Ranker

Ranking students with chained collection operations — `sortedByDescending`, `mapIndexed`, `filter`, `forEach` — and data class `copy()` for immutable rank assignment.

```kotlin
val students = listOf(...)
    .sortedByDescending { it.grade }
    .mapIndexed { index, student -> student.copy(rank = index + 1) }
```

### Day 2 · Word Frequency Analyzer

`MutableSet` for unique words + `MutableMap<String, Int>` for frequency counting, with formatted table output using `padEnd`.

```
Word  |Frequency
----------------
Where | 2
there | 4
is    | 4
Ram   | 2
truth | 2
```

### Day 3 · Data Class Deep Dive + Library v2

Two programs:
- **Data class features**: `copy()`, destructuring `val (name, grade) = ...`, structural equality (`==`), `vararg`
- **Library System v2**: Refactored with `isEmpty()` checks and indexed access `[]` replacing `.get()`

### Day 4 · Enum Classes, Sealed Interfaces & Sealed Classes

Three programs showcasing Kotlin's type hierarchy tools:

| Program | Concept | Example |
|:---|:---|:---|
| **Enum Class** | Fixed set of constants with properties | `Country.GERMANY`, `Country.entries` |
| **Sealed Interface** | Exhaustive `when` + data class subtypes | `Shape` → `Circle`, `Rectangle` with area computation |
| **App State Model** | Real-world sealed class pattern | `UIState.Idle` → `Loading` → `Success(users)` → `Error(msg)` |

```kotlin
sealed class UIState {
    object Idle : UIState()
    object Loading : UIState()
    data class Success(val users: List<String>): UIState()
    data class Error(val message: String): UIState()
}
```

### Day 5 · Contact Book — List vs Map

The same contact manager built with two data structures for comparison:

| Implementation | Backing Store | Key Operations |
|:---|:---|:---|
| **List-based** | `MutableList<Contact>` | `find`, `removeIf`, `forEach` |
| **Map-based** | `MutableMap<String, Contact>` | Phone-keyed lookup, `entries.find`, `remove` |

Both include full test suites: creation, add, search (existing + missing), delete (existing + missing), and search-after-delete.

---

## 📂 Repository Structure

```
Kotlin-Practise/
│
├── Week 1 Day 1/
│   └── Number Guessing Game/          ← when, while, readln, ranges
│
├── Week 1 Day 2/
│   ├── String Operations/             ← trim, uppercase, replace, substring
│   ├── String template/               ← $, ${}, multiline """
│   └── Word Processing/               ← split, joinToString, startsWith
│
├── Week 2 Day 1/
│   └── Classes and Objects/           ← data class, named arguments
│
├── Week 2 Day 2 - Bank Account/
│   └── Constructors and Init/         ← primary + secondary constructors, init
│
├── Week 2 Day 3/
│   └── Animal inheritance hierarchy/  ← open, override, polymorphism, apply
│
├── Week 2 Day 4/
│   ├── Abstract Class/                ← abstract fun, companion object
│   └── Interface/                     ← interface contract, property declarations
│
├── Week 2 Day 5/
│   └── mini Library system/           ← multi-class OOP project
│
├── Week 3 Day 1/
│   └── NullSafety-Kotlin-Practice/    ← ?. ?. ?: !! let toIntOrNull
│
├── Week 3 Day 2/
│   └── Main.kt                        ← 5 lambda expressions
│
├── Week 3 Day 3/
│   └── Main.kt                        ← higher-order functions, custom filter
│
├── Week 3 Day 4/
│   └── BankAccount 2/                 ← refactored with null safety
│
├── Week 3 Day 5/
│   └── BankAccount 3/                 ← lambdas + scope functions
│
├── Week 4 Day 1/
│   └── Main.kt                        ← student ranker, collection ops
│
├── Week 4 Day 2/
│   └── Main.kt                        ← Set + Map, word frequency
│
├── Week 4 Day 3/
│   ├── Main.kt                        ← data class copy, destructuring
│   └── miniLibrary2.kt                ← library system v2
│
├── Week 4 Day 4/
│   ├── Enum Class.kt                  ← enum with properties
│   ├── When with Sealed Interface.kt  ← sealed interface + when
│   └── app states model.../           ← sealed class UI state machine
│
└── Week 4 Day 5/
    ├── Contactbook using List.kt      ← MutableList CRUD
    └── Contactbook using Map.kt       ← MutableMap CRUD
```

---

## 🧠 Learning Progression

```
Week 1                    Week 2                    Week 3                    Week 4
──────                    ──────                    ──────                    ──────
Variables & Types    ──►  Classes & Objects    ──►  Null Safety         ──►  Collections Mastery
Control Flow (when)  ──►  Constructors & Init  ──►  Lambda Expressions  ──►  Data Class Features
String Manipulation  ──►  Inheritance & Poly.  ──►  Higher-Order Funcs  ──►  Enum & Sealed Types
User Input (readln)  ──►  Abstract & Interface ──►  Scope Functions     ──►  Real-World Projects
                     ──►  Multi-Class Systems  ──►  Progressive Refactor──►  Data Structure Comp.
```

---

## 🔁 The Bank Account Evolution

One of the highlights of this repo is a **single project progressively refactored** across 3 weeks as new concepts are learned:

| Version | Week | New Concepts Applied |
|:---|:---|:---|
| **v1** — `bankAccount` | Week 2, Day 2 | Primary + secondary constructors, `init` block |
| **v2** — `BankAccount` | Week 3, Day 4 | Default params, `private set`, null-safe display |
| **v3** — `BankAccount` | Week 3, Day 5 | Lambdas, `apply`, higher-order `executeIfSufficient` |

---

## ▶️ How to Run

1. Open any project folder in **IntelliJ IDEA**
2. Navigate to `src/Main.kt` (or the `.kt` file in the folder)
3. Click the ▶️ **Run** gutter icon next to `fun main()` — or press **Shift + F10**

> **Note**: Standalone `.kt` files (Week 3 Day 2, Week 4 Day 1–5) can be run directly without the IntelliJ project wrapper — just open the file and run.

---

## 🛠 Tech Stack

| Tool | Purpose |
|:---|:---|
| **Kotlin** | Language (JVM target) |
| **IntelliJ IDEA** | IDE & project modules |
| **Git** | Version control — 26 commits tracking the learning journey |

---

<p align="center">
  <sub>Built with ☕ and curiosity · <strong>Krishna Chaitanya</strong></sub>
</p>
