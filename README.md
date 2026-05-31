# 🚀 Kotlin Practice

A structured collection of Kotlin projects built while learning Kotlin fundamentals — week by week, day by day.  
Each project lives in its own IntelliJ IDEA module. Source code is always at `<Project>/src/Main.kt`.

---

## 📂 Repository Structure

```
Kotlin/
├── Week 1 Day 1/
│   └── Number Guessing Game/
├── Week 1 Day 2/
│   ├── String Operations/
│   ├── String template/
│   └── Word Processing/
├── Week 2 Day 1/
│   └── Classes and Objects/
├── Week 2 Day 2/
│   └── Constructors and Init/
├── Week 2 Day 3/
│   └── Animal inheritance hierarchy/
├── Week 2 Day 4/
│   ├── Abstract Class/
│   └── Interface/
└── Week 2 Day 5/
    └── mini Library system/
```

---

## 📅 Week 1

### Day 1 — Conditionals, `when` Expressions & Loops

| Project | Description |
|---|---|
| **Number Guessing Game** | A console game where the player guesses a randomly generated number between 1–100. Uses `when` expressions for feedback (too high / too low) and a `while` loop to keep prompting until the correct answer is found. Tracks and reports the number of attempts. |

📁 `Week 1 Day 1/Number Guessing Game/src/Main.kt`

---

### Day 2 — Strings & String Operations

| Project | Description |
|---|---|
| **String Operations** | Demonstrates common Kotlin String functions: `trim()`, `uppercase()`, `lowercase()`, `contains()`, `replace()`, `length`, and `substring()`. |
| **String template** | Showcases Kotlin string templates — simple `$variable` interpolation, `${}` expression embedding, and multi-line raw strings (`"""`). |
| **Word Processing** | Takes a sentence, splits it into words, counts them, converts to Title Case using `joinToString` + `replaceFirstChar`, and identifies the first/last word. |

📁 `Week 1 Day 2/<Project>/src/Main.kt`

---

## 📅 Week 2

### Day 1 — Classes & Objects

| Project | Description |
|---|---|
| **Classes and Objects** | Introduces Kotlin `data class`. Models an `excelStudent` with `name`, `marks`, and `grade` properties, and a `greet()` method. Demonstrates named arguments and property mutation. |

📁 `Week 2 Day 1/Classes and Objects/src/Main.kt`

---

### Day 2 — Constructors & Init Blocks

| Project | Description |
|---|---|
| **Constructors and Init** | Models a `bankAccount` class with a primary constructor, `init` block (welcome message), and two secondary constructors. Implements `deposit()`, `Withdraw()`, and `checkBalance()` operations with balance validation. |

📁 `Week 2 Day 2/Constructors and Init/src/Main.kt`

---

### Day 3 — Inheritance

| Project | Description |
|---|---|
| **Animal inheritance hierarchy** | Demonstrates Kotlin inheritance with an `open` base class `Animal`. `Dog`, `Cat`, and `Mouse` subclasses each override `sound()`. Uses polymorphism — all animals stored in a `List<Animal>` and iterated uniformly. |

📁 `Week 2 Day 3/Animal inheritance hierarchy/src/Main.kt`

---

### Day 4 — Abstract Classes & Interfaces

| Project | Description |
|---|---|
| **Abstract Class** | Defines a `Borrowable` abstract class with abstract `borrow()` and `returnItem()` methods, plus a `companion object` to track total borrow count. `Book` and `Magazine` are concrete implementations. |
| **Interface** | Refactors the same library scenario using a `Borrowable` interface instead of an abstract class. `Book` and `Magazine` implement the interface, highlighting the structural difference between interfaces and abstract classes. |

📁 `Week 2 Day 4/<Project>/src/Main.kt`

---

### Day 5 — Capstone Project

| Project | Description |
|---|---|
| **mini Library system** | A complete mini library management system tying together all Week 2 concepts. Features a `Book` data class, a `Member` class (with borrow/return tracking), and a `Library` class managing a collection of books and members. Demonstrates availability checks, membership registration, multi-member borrow/return flows, and list reporting. |

📁 `Week 2 Day 5/mini Library system/src/Main.kt`

---

## 🛠️ How to Run

1. Open any project folder in **IntelliJ IDEA**.
2. The source file is located at `src/Main.kt`.
3. Click the ▶️ **Run** button next to `fun main()`, or use `Shift + F10`.

---

## 🧠 Concepts Covered

- Variables (`val` / `var`), Data Types, Type Inference
- Conditionals (`if`, `when`), Loops (`while`, `for`)
- String templates and multi-line strings
- String manipulation functions
- Classes, Data Classes, Objects
- Primary & Secondary Constructors, `init` blocks
- Inheritance, Method Overriding (`open` / `override`)
- Abstract Classes & Interfaces
- Collections (`List`, `MutableList`)
- Companion Objects
- Polymorphism

---

> **Note:** Each project is an independent IntelliJ IDEA module. Source code is always at `<ProjectFolder>/src/Main.kt`.
