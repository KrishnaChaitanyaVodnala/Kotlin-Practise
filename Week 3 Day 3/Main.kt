// 1. Write 5 higher-order functions from scratch — each takes a lambda and calls it. Don't just copy, think about the function type signature first.
fun repeatTwice(action: () -> Unit) {
    action()
    action()
}

fun operator(num: Int, operate: (Int) -> Int): Int { // Try Ex func
    return operate(operate(num))
}

fun printMessage(message: String, printer: (String) -> Unit) {
    printer(message)
}

fun processNumber(num: Int, action: (Int) -> Unit) {
    action(num)
}

fun checkValue(num: Int, checker: (Int) -> Boolean): Boolean {
    return checker(num)
}

// 2. Pass lambdas as parameters to your own functions — simulate something like repeat(3) { println("hello") } but build your own version of repeat.
fun repeat(num: Int, action: () -> Unit) {
    for(i in 1..num) {
        action()
    }
}

// 3. Build a simple myFilter function: takes a List<Int> and a (Int) -> Boolean predicate, returns filtered list. Then call it with a lambda. This is literally how Kotlin's filter() works under the hood — understanding this makes every collection operation click.
fun List<Int>.myFilter(predicate: (Int) -> Boolean): List<Int> {
    val ans = mutableListOf<Int>()
    for(i in this) {
        if(predicate(i)) {
            ans.add(i)
        }
    }
    return ans
}

// Main funtion
fun main() {
// #1
    val num = 3
    repeatTwice() {
        println("Twice")
    }
    println()
    
    val num2: Int = operator(num) { it*2 }
    println("operate(2) = $num2\n")
    
    printMessage("Hello World") {
        println("$it\n")
    }
    
    processNumber(num) {
        println("$it x $it = ${it*it}\n")
    }
    
    val check: Boolean = checkValue(num) { it >= 0 }
    println("Is the number positive? $check\n")
    
// #2
    repeat(num) {
        println("Hello")
    }
    println()
    
// #3
    val l = listOf(1, 2, 3, 4, 5)
    println("Original: $l")
    val temp = l.myFilter{
        !(it%2 == 0)
    }
    println("My Filter: $temp")
}