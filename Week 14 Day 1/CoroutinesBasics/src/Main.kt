import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

fun main() = runBlocking {
    println(task1())
}

//fun main() = runBlocking {
//    val startTime = System.currentTimeMillis()
//    val deferred1 = async { task1() }
//    val deferred2 = async { task2() }
//
//    val result1 = deferred1.await()
//    println(result1)
//
//    val task1EndTime = System.currentTimeMillis()
//    println("Task 1 execution time: ${task1EndTime - startTime}")
//
//    val result2 = deferred2.await()
//    println(result2)
//
//    val task2EndTime = System.currentTimeMillis()
//    println("Task 2 execution time: ${task2EndTime - startTime}")
//
//    println("Total tasks execution time: ${task2EndTime - startTime} ms\n")
//}

suspend fun task1(): String {
    delay(1000.milliseconds)
    return "Task 1 executed ${System.currentTimeMillis()}"
}

suspend fun task2(): String {
    delay(1000.milliseconds)
    return "Task 2 executed ${System.currentTimeMillis()}"
}