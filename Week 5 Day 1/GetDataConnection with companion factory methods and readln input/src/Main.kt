// Week 5, Day 1 - GetDataConnection with companion factory methods and readln input
class GetDataConnection private constructor(
    val host: String,
    val port: Int
) {
    fun connect() {
        println("Connecting to $host:$port")
    }
    companion object {
        private const val DEFAULT_HOST = "localhost"
        private const val DEFAULT_PORT = 5473
        fun createConnection(host: String, port: Int): GetDataConnection = GetDataConnection(host, port)
        fun getDefaultConnection(): GetDataConnection = GetDataConnection(DEFAULT_HOST, DEFAULT_PORT)
        fun createFromEnv(): GetDataConnection {
            print("Enter Host: ")
            val host = readln()
            print("Enter Port: ")
            val port = readln().toIntOrNull() ?: error("Invalid Input")
            return GetDataConnection(host, port)
        }
    }
}

fun main() {
    val obj1 = GetDataConnection.createConnection("VKC", 2007)
    val obj2 = GetDataConnection.getDefaultConnection()

    obj1.connect()
    obj2.connect()
    println("\nCreate from env. :")
    val envObj = GetDataConnection.createFromEnv()
    envObj.connect()
}