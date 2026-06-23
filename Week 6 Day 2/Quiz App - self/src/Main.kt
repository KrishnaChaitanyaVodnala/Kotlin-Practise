// Week 6, Day 2 - Quiz App - self
data class Question(
    val text: String,
    val options: List<String>,
    val correctOption: Int
    )

fun main() {
    val questions = mutableListOf<Question>()
    questions.add(Question("Q1: What is the output of println(1 + \"2\")?\n" +
            "\nOptions:\n",
            listOf("  1. 3\n",
            "  2. 12\n",
            "  3. Error\n",
            "  4. 1 + 2\n"), 3))
    questions.add(Question("Q2: What is the output of println(10 / 3)\n" +
            "\nOptions:\n",
            listOf(" 1. 3\n",
            " 2. 3.33\n",
            " 3. 4\n",
            " 4. Error\n"), 1))
    questions.add(Question("Q3: What is the output of:\n" +
            "var x = 5\n" +
            "println(x++)\n" +
            "println(x)\n" +
            "\nOptions:\n",
            listOf(" 1. 5 then 5\n",
            " 2. 6 then 6\n",
            " 3. 5 then 6\n",
            " 4. Error\n"), 3))
    questions.add(Question("Q4: What is the output of: println(true && false)\n" +
            "\nOptions:\n",
            listOf(" 1. true\n",
            " 2. false\n",
            " 3. null\n",
            " 4. Error\n"), 2))
    questions.add(Question("Q5: What is the output of:\n" +
            "val name = \"Krishna\"\n" +
            "println(name.length)\n" +
            "\nOptions:\n",
            listOf(" 1. 6\n",
            " 2. 7\n",
            " 3. 8\n",
            " 4. Error\n"), 2))
    var score = 0
    val maxScore = questions.size
    println("Quiz:")
    questions.forEach { (text, options, correctOption) ->
        print(text)
        options.forEach {
            print(it)
        }
        print("Enter your answer: ")
        var option: Int? = readln().toIntOrNull()
        while(option == null || option < 1 || option > options.size) {
            println("Invalid entry! Try again!")
            print("Enter your answer: ")
            option = readln().toIntOrNull()
        }
        if(option == correctOption) {
            println("✓ Correct!")
            score++
        } else {
            println("✘ Wrong!")
        }
        println()
    }
    println("Final score: $score/$maxScore (${((score.toDouble()/maxScore)*100.00).toFloat()}%)")
}