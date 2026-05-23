// Week 1, Day 4 — String Operations

fun main() {
    var str = " Hello, Kotlin is awesome for Android "
    println(str.trim()) // Removes extra white spaces
    println(str.uppercase())
    println(str.lowercase())
    println(str.contains("And"))
    println(str.replace("Android", "Developers!"))
    println(str.length)
    println(str.substring(8, 14))
}