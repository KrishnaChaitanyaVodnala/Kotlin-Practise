import kotlinx.coroutines.*

// Step 1
fun main() = runBlocking {
        val startTime = System.currentTimeMillis()
        
        println(fakeNetworkCall1())
        println(fakeNetworkCall2())
        
    val endTime = System.currentTimeMillis()
        println("Total time: ${endTime - startTime}")
}

// Step 2
// fun main() = runBlocking {
//         val startTime = System.currentTimeMillis()
        
//         val result1 = async{ fakeNetworkCall1() }
//         val result2 = async{ fakeNetworkCall2() }
        
//         val results = awaitAll(result1, result2)
        
//         println(results[0])
//         println(results[1])
        
//     	val endTime = System.currentTimeMillis()
//         println("Total time: ${endTime - startTime}")
// }

suspend fun fakeNetworkCall1(): String {
    delay(1000)
    return "Connected to the ABC Server"
}

suspend fun fakeNetworkCall2(): String {
    delay(1000)
    return "Connected to the XYZ Server"
}