import kotlinx.coroutines.*

fun main() = runBlocking {
    val job = launch {
        while(true) {
            println("Polling")
            delay(1000)
        }
    }
    delay(2500)
    job.cancel()
    println("Job Cancelled")
    delay(3000)
    println("Session Ended")
}