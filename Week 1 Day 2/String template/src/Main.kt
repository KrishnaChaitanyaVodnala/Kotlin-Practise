// Week 1, Day 4 — String templates showcase
fun main() {
    val name = "Krishna Chaitanya"
    val roll = "247R1A05J9"
    val clg = "CMRTC"
    // $ is for variable values
    println("My Name is $name")
    // ${} is for expressions in it
    println("I am currently in 3rd year")
    // Multiline Strings
    val bio = """
        Name: $name
        Roll no: $roll
        College: $clg
    """.trimIndent()
    println("My details:\n"+bio)
}
