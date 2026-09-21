import kotlinx.coroutines.*

fun main() = runBlocking {
        println("${Thread.currentThread().name} - runBlocking function")

		val job = launch {
            try {
                println(fakeNetworkCall(shouldFail = true))
            } catch (e: CancellationException) {
                println("Coroutine was cancelled")
                throw e
            } catch (e: IllegalStateException) {
                println("Network call failed: $e")
            } catch (e: Exception) {
                println("Network call failed for - $e")
            }
        }
        
//         delay(500)      // let it start, but not finish (call takes 2000ms)
//         job.cancel()    // kill it mid-flight
//         job.join()      // wait for cancellation to complete
        
        println("${Thread.currentThread().name} - runBlocking function after trying Network call")
}

suspend fun fakeNetworkCall(shouldFail: Boolean): String {
    return withContext(Dispatchers.IO) {
        delay(2000)
        
        if (shouldFail) {
            throw IllegalStateException("Server rejected request")
        }
        
        println("${Thread.currentThread().name} - Network Call")
        "Hi Krishna - You are connected to the Server"
    }
}