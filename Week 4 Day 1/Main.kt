// Week 4, Day 1 — student ranker using sortedByDescending and mapIndexed
data class Student(val rank: Int = 0, val name: String, val age: Int, val grade: Int)

fun main() {
    val students = listOf(
        Student(name = "Krishna", age = 19,grade =  78),
        Student(name = "Ayansh",  age = 6, grade = 92),
        Student(name = "Harshil", age = 9, grade = 85), 
        Student(name = "Mano",    age = 16,grade =  82)
    )
    .sortedByDescending { it.grade }
    .mapIndexed { index, student -> student.copy(rank = index + 1) }
    
    println("===Welcome to Karimnagar Public School===")
    println("Top Performers:")
    val topPerformers = students.filter {
        it.rank <= 2
    }
    
    topPerformers.forEach {
        println("Rank: ${it.rank}\nName: ${it.name}\nAge: ${it.age}\nMarks: ${it.grade}\n")
    }
    
    println("Total Students: ")
    students.forEach {
        println("Rank: ${it.rank}\nName: ${it.name}\nAge: ${it.age}\nMarks: ${it.grade}\n")
    }
}