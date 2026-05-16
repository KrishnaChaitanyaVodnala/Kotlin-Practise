fun main() {
    val secret = (1..100).random()
    var attempts = 0
    println("Number Guessing Game")
    println("====================")
    while(true) {
        print("Guess the number: ")
        val guess = readln().toInt()
        attempts++
        when {
            guess > secret -> println("You are too high")
            guess < secret -> println("You are too low")
            else -> {
                println("You guessed in $attempts attempts")
                break
            }
        }
    }
}