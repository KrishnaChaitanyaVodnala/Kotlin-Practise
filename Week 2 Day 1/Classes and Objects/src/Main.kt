// Week 2, Day 1 — Classes and Objects
fun main() {
    val e1st = excelStudent(marks = 100, name = "Krishna", grade = "O")
    val e2nd = excelStudent("Meena", 90, "A+")
    val e3rd = excelStudent("Kiran", 89, "B+")

    e1st.greet()
    e2nd.greet()
    e3rd.grade = "A"
    e3rd.greet()
}

data class excelStudent(var name: String, var marks: Int, var grade: String) {
    fun greet() {
        println("Hello $name, you scored $marks marks and $grade grade.")
    }
}