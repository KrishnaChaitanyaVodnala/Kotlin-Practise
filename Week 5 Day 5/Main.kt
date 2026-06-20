// Week 5, Day 5 - 5 practice questions 

// 1. Write a generic class Stack<T> with push(), pop() (returns T?), peek(), and isEmpty(). Use it with both Int and String.

class Stack<T> {
    private val list = mutableListOf<T>()
    fun push(value: T) = list.add(value)
    fun pop(): T? = list.removeLastOrNull()
    fun peek(): T? = list.lastOrNull()
    val size: Int get() = list.size
    fun isEmpty(): Boolean = list.isEmpty()
}

fun main() {
    val stInt = Stack<Int>()
    stInt.push(1)
    stInt.push(2)
    stInt.push(3)
    println(stInt.size)
    println(stInt.isEmpty())
    println(stInt.peek())
    println(stInt.pop())
    println(stInt.pop())
    println(stInt.pop())
    println(stInt.pop())
    println(stInt.peek())
    
    val stString = Stack<String>()
    stString.push("1")
    stString.push("2")
    stString.push("3")
    println(stString.size)
    println(stString.isEmpty())
    println(stString.peek())
    println(stString.pop())
    println(stString.pop())
    println(stString.pop())
    println(stString.pop())
    println(stString.peek())
}

// 2. Q2. Create a sealed class NetworkResult<T> with three states: Success(data: T), Error(message: String), and Loading. Write a function that takes a NetworkResult<List<String>> and prints something meaningful for each state.

sealed class NetworkResult<out T> {
    data class Success<T>(val data: T): NetworkResult<T>()
    data class Error(val message: String): NetworkResult<Nothing>()
    object Loading: NetworkResult<Nothing>()
}

fun handleResult(result: NetworkResult<List<String>>) {
    when(result) {
        is NetworkResult.Success -> println("Got ${result.data.size} items: ${result.data.joinToString(", ")}")
	is NetworkResult.Error -> println("Failed: ${result.message}")
	is NetworkResult.Loading -> println("Loading")
    }
}

fun main() {
    val success: NetworkResult<List<String>> = NetworkResult.Success(listOf("a", "b", "c"))
    val error: NetworkResult<List<String>> = NetworkResult.Error("Unexpected crash")
    val loading: NetworkResult<List<String>> = NetworkResult.Loading

    handleResult(success)
    handleResult(error)
    handleResult(loading)
}

// 3. Q3. Write an extension function on String called isPalindrome() that returns Boolean. Then write one on List<Int> called secondLargest() that returns Int? (null-safe if the list has fewer than 2 elements).
fun String.isPalindrome(): Boolean = (this == this.reversed())
fun List<Int>.secondLargest(): Int? {
    if(this.size < 2) return null
    val sorted = this.sortedDescending() // Leave it
    return sorted[1]
}

fun main() {
    // Testing String.isPalindrome()
    val word1 = "madam"
    val word2 = "hello"

    println("\"$word1\" palindrome? ${word1.isPalindrome()}")
    println("\"$word2\" palindrome? ${word2.isPalindrome()}")

    // Testing List<Int>.secondLargest()
    val nums1 = listOf(10, 5, 8, 20, 15)
    val nums2 = listOf(42)

    println("Second largest in $nums1 = ${nums1.secondLargest()}")
    println("Second largest in $nums2 = ${nums2.secondLargest()}")
}

// 4. A UserSession should only ever have one instance in the app. Implement it as a Kotlin object with a currentUser: String? property and a login(name: String) / logout() method. Then explain in a comment why you used object and not companion object.
object UserSession {
    var currentUser: String? = null
        private set // Since currentUser can be edited only inside the class
    fun login(name: String) { 
	currentUser = name 
	println("Logged in as $name") 
    }
    fun logout() { 
        if(currentUser != null) {
            println("Logged out of User: $currentUser")
            currentUser = null
        } else {
            println("No Active user to Logout!")
        }
    }
}

fun main() {
    UserSession.logout()
    UserSession.login("krish_vodnala")
    UserSession.logout()
}
// I have not used companion object. Instead I choose object because it is a true global singleton with zero instantiation, and companion object is scoped to a class which might have instances. UserSession never need instances of anything - it is pure global state - so object is the right call

// 5. Write a class MathUtils with a companion object that has a factory method create() returning a MathUtils instance, plus a PI constant. Add a method circleArea(radius: Double) on the class itself. Call it using both MathUtils.create().circleArea(5.0) and MathUtils.PI.
class MathUtils private constructor() {
    companion object {
        fun create(): MathUtils = MathUtils()
        const val PI = 3.14
    }
    fun circleArea(radius: Double): Double = PI*radius*radius
}

fun main() {
    println(MathUtils.PI)
    val obj = MathUtils.create()
    println(obj.circleArea(2.0))
}