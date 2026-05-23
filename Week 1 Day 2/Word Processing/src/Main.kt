// Week 1, Day 4 — Word Processing
fun main() {
    val userInput = "Hyderabad is a great city for developers"
    // Splits the String
    val words = userInput.split(" ")
    // Counts the number of words
    println("Word count: ${words.size}")
    // Joins the String by making 1st letter capital of each word
    val titleCase = words.joinToString(" ") { it.replaceFirstChar { c -> c.uppercaseChar()}}
    println("Title case: $titleCase")
    // Finding start/end words
    println("Starts with 'hyd': ${ userInput.startsWith("Hyd") }")
    println("Last word: ${words.last()}")
}