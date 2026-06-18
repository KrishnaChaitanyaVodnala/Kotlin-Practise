// Week 5, Day 4 - Simple Logger singleton
object Logger {
    val map = mapOf("DEBUG" to 0, "INFO" to 1, "ERROR" to 2)
    var logLevel = "ERROR"
    val history = mutableListOf<String>()
    fun log(tag: String, message: String) {
        val threshold = map[logLevel]?: return
        val rank: Int = map[tag]?: return
        if(rank >= threshold) {
            println(message)
            history.add("[$tag] $message")
        }
    }
    fun printHistory() {
        for(event in history) {
            println("-> $event")
        }
    }
}

fun main() {
    println("Current Log Level: ${Logger.logLevel}")
    println()

    // Only ERROR logs should print
    Logger.log("DEBUG", "App started")
    Logger.log("INFO", "User logged in")
    Logger.log("ERROR", "Crash occurred")

    println("\nChanging log level to INFO...\n")
    Logger.logLevel = "INFO"

    // INFO and ERROR should print
    Logger.log("DEBUG", "Button clicked")
    Logger.log("INFO", "Settings opened")
    Logger.log("ERROR", "Network failure")

    println("\nChanging log level to DEBUG...\n")
    Logger.logLevel = "DEBUG"

    // Everything should print
    Logger.log("DEBUG", "API request sent")
    Logger.log("INFO", "Response received")
    Logger.log("ERROR", "Timeout error")

    println("\nTesting invalid tag...")
    Logger.log("WARNING", "This won't be logged") // invalid tag

    Logger.printHistory()
}