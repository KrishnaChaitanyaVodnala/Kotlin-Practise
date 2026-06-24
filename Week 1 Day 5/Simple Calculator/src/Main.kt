// Week 1, Day 5 - Simple Calculator
fun main() {
    println("Simple Calculator: ")
    println("===================")
    var a: Int? = 0
    var b: Int? = 0

    while (true) {
        while(true) {
            print("Enter number 'a': ")
            a = readln().toIntOrNull()
            if(a != null) break

            println("Invalid input Try Again!")
            continue
        }

        while(true) {
            print("Enter number 'b': ")
            b = readln().toIntOrNull()
            if(b != null) break

            println("Invalid input Try Again!")
            continue
        }

        print("Choose Operation(+, -, *, /): ")

        when (readln()) {
            "+" -> println("Answer: ${a + b}")
            "-" -> println("Answer: ${a - b}")
            "*" -> println("Answer: ${a * b}")
            "/" -> {
                if (b == 0)
                    println("Can't divide by Zero!")
                else
                    println("Answer: ${a / b}")
            }

            else -> println("Enter correct Operator!")
        }

        print("Do you want to do another Calculation?(Y/N): ")
        var choice = readln()

        while(!choice.equals("Y", ignoreCase = true) && !choice.equals("N", ignoreCase = true)) {
            println("Enter Valid Choice!")
            print("Do you want to do another Calculation?(Y/N): ")
            choice = readln()
        }
        if (choice.equals("N", ignoreCase = true))
            break
    }

    println("ThankYou!")
}