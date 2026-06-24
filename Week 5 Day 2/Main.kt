// Week 5, Day 2 - Extension functions
fun String.isPalindrome(): Boolean = (this == this.reversed())

fun String.wordCount(): Int = this.trim().split("\\s+".toRegex()).size

fun Int.isEven(): Boolean = this%2 == 0

fun Int.factorial(): Long {
    require(this >= 0)
    var n = 1L
    for(i in 1..this) {
        n *= i
    }
    return n
}

fun List<Int>.secondLargest(): Int {
    if(this.size == 0) error("Invalid Entry!")
    if(this.size == 1) return this[0]
    val sorted = this.sortedDescending()
    return sorted[1]
}

fun main() {
    // String extensions
    print("Enter Word to check palindrome: ")
    val text1 = readln()
    println("\"$text1\" is palindrome? ${text1.isPalindrome()}")
    
    print("Enter Sentence to count the number of words: ")
    val sentence = readln()
    println("Word count: ${sentence.wordCount()}")

    // Int extensions
    print("Enter number to check whether it is even: ")
    val num1 = readln().toIntOrNull()
    if(num1 != null){
        println("$num1 is even? ${num1.isEven()}")
    }else {
        println("Invalid Input")
    }
    
    print("Enter number to find its factorial: ")
    val num2 = readln().toIntOrNull()
    if(num2 != null) {
        println("Factorial of $num2 = ${num2.factorial()}")
    }else {
        println("Invalid Input")
    }

    // MutableList extension
    val list = mutableListOf(10, 50, 30, 40, 20)
    println("Second largest element = ${list.secondLargest()}")
}