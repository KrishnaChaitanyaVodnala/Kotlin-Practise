// Week 4, Day 2 - Map and Sets usage in Kotlin
fun main() {
    val str = "Where there is Ram there is truth Where there is truth there is Ram"
    
    val words = str.split(" ")
    val set = mutableSetOf<String>()
    val map = mutableMapOf<String, Int>()
    
    for(word in words) {
        set.add(word)
        map[word] = (map[word] ?: 0) + 1
    }
    
    println("Sentence: $str")
    
    println("\nSet:-")
    println("Unique words: ")
    for(word in set) {
    // for(word in map.keys) {
        println(word)
    }
    
    println("\nMap:-")
    println("Word  |Frequency")
    println("----------------")
    map.forEach { (k, v) ->
        println("${k.padEnd(6)}| $v")
    }
}