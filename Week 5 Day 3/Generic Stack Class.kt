//Week 5, Day 3 - Generic Stack Class
class Stack<T> {
    private val elements = mutableListOf<T>()
    val size: Int get() = elements.size
    fun push(element: T) = elements.add(element)
    fun pop(): T? = elements.removeLastOrNull()
    fun peek(): T? = elements.lastOrNull()
    fun isEmpty(): Boolean = elements.isEmpty()
}

fun main() {
    val st = Stack<Int>()
    st.push(1)
    st.push(2)
    st.push(3)
    st.push(4)
    println(st.size)
    println("\nisEmpty? ${st.isEmpty()}")
    println(st.peek())
    st.pop()
    println(st.pop())
    println(st.pop())
    println(st.pop())
    println(st.pop())
    println("isEmpty? ${st.isEmpty()}\n")
    
    val stringStack = Stack<String>()
    stringStack.push("Hello"); stringStack.push("World"); stringStack.push("Kotlin")
    println(stringStack.size)
    println(stringStack.peek())
    repeat(4) { println(stringStack.pop()) }
    println("isEmpty? ${stringStack.isEmpty()}")

}