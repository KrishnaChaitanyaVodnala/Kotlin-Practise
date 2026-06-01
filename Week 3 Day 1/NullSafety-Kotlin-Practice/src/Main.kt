// Week 3, Day 1 — NullSafety-Kotlin-Practice

// ?: uses when input is null
// ?. uses when input is not null

// ── Program 1: User Profile Lookup ──────────────────────────
// Demonstrates: ?. safe call + ?: Elvis + let
fun userProfileLookup() {
    print("Enter Username: ")
    val username: String? = readln()
    println(username?.let { "Welcome, $it!" } ?: "Guest user")
}

// ── Program 2: Phone Book ────────────────────────────────────
// Demonstrates: nullable Map values + ?: Elvis in loop
fun phoneBook() {
    val map = mutableMapOf<String, String?>(
        "Krish" to "9989019777",
        "Mano" to null
    )
    for ((key, value) in map) {
        println("Name: $key")
        println("Phone: ${value ?: "Not Available"}\n")
    }
}

// ── Program 3: Chain of Nulls ────────────────────────────────
// Demonstrates: nested ?.let chaining across multiple nullables
fun chainOfNulls() {
    val city: String? = "Karimnagar"
    val country: String? = "India"
    val pincode: String? = null
    println(
        city?.let { c ->
            country?.let { co ->
                pincode?.let { p -> "$c, $co - $p" }
            }
        } ?: "Incomplete Address"
    )
}

// ── Program 4: The Intentional Crash ────────────────────────
// Demonstrates: !! throws NullPointerException vs ?. handles safely
fun intentionalCrash() {
    val input: String? = null
    // println(input!!.length)  // ← uncomment to see NullPointerException
    println("String length is ${input?.length}") // prints: null, no crash
}

// ── Program 5: Safe Number Parser ───────────────────────────
// Demonstrates: toIntOrNull() returns Int? — type-safe null handling
fun safeNumberParser() {
    print("Enter your number: ")
    val raw = readln()
    val num = raw.toIntOrNull()
    println(if (num == null) "Invalid input, couldn't parse" else num * 2)
}

// ── Entry Point ──────────────────────────────────────────────
fun main() {
    userProfileLookup()
    phoneBook()
    chainOfNulls()
    intentionalCrash()
    safeNumberParser()
}