import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import kotlin.time.Duration.Companion.milliseconds

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

fun main() = runBlocking {
    println("Main program starts: ${Thread.currentThread().name}")
    println("${fetchData()}")
    println("${sumLargeList()}")
    println("Main program ends: ${Thread.currentThread().name}")
}

suspend fun fetchData(): String {
    return withContext(Dispatchers.IO) {
//        Dispatchers.IO is used because this function does I/O-bound operation, which shouldn't occupy a CPU - Thread while waiting

//        Default would be wrong here — its small pool is meant for CPU work, not for
//        sitting idle on I/O. That would block CPU threads doing nothing.
        println("${Thread.currentThread().name} starts")
        delay(1000.milliseconds)
        "data fetched"
    }
}

suspend fun sumLargeList(): Long {
    return withContext(Dispatchers.Default) {
//        Here, if using the Dispatcher.IO is wrong because we are summing up a large list, which require CPU - Thread rather than I/O threads.
        println("${Thread.currentThread().name} starts")
        (1..10_000_000L).sum()
    }
}