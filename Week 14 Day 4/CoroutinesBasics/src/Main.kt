import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
import kotlin.time.Duration.Companion.milliseconds

fun main() = runBlocking {
    countingFlow().collect {
        println(it)
    }
}


fun countingFlow(): Flow<Int> {
    return flow {
        val startValue = 1
        var currentValue = startValue
        while(currentValue < 6) {
            delay(1000L.milliseconds)
            emit(currentValue)
            currentValue++
        }
    }
}