import kotlinx.coroutines.*
fun main() = runBlocking {
    println("Main Thread: ${Thread.currentThread().name}")
    
    println(fakeNetworkCall())
    
    withContext(Dispatchers.Default) {
	    println("${Thread.currentThread().name} - Updating UI")
    }
}

suspend fun fakeNetworkCall(): String {
    return withContext(Dispatchers.IO) {
        delay(2000)
        println("${Thread.currentThread().name} - Network Call")
        "Connected to the Server"
    }
}