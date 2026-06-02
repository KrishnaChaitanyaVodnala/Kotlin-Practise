// Week 3, Day 2 — 5 lambdas for different tasks

// 1. A lambda that takes a number and returns its square
fun main() {
    print("Enter a number: ")
    val num: Int = readln().toInt()
    val sqr: (Int) -> Int = { it * it }
    println("Square = ${sqr(num)}")
}

// 2. A lambda that checks if a string is longer than 5 characters
fun main() {
    print("Enter a String: ")
    val str: String = readln()
    val check: (String) -> Boolean = {
        it.length > 5
    }
    println(if(check(str)) "String is valid" else "String is Invalid")
}

// 3. A lambda that takes two ints and returns the larger one
fun main() {
    print("Enter two numbers: ")
    val (n1, n2) = readln().split(" ").map{ it.toInt() }
    val largest: (Int, Int) -> Int = { a, b ->
        if(a > b) a else b
    }
    println("Largest is ${largest(n1, n2)}")
}

// 4. A lambda stored in a variable, then called later
fun main() {
    val username1: String? = null
    val username2: String = "Krishna"
    val greet: (String?) -> String = {
        if(it != null) "Welcome, $it" else "Guest user"
    }
    println(greet(username1))
    println(greet(username2))
}

// 5. Pass a lambda as an argument to another function
fun greet(string: String, lambdaFun: (String) -> String) {
    println("Uppercase is ${lambdaFun(string)}")
}
fun main() {
    print("Enter name: ")
    val name: String = readln()
    greet(name, { it.uppercase() })
}