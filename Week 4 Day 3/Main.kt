// Week 4, Day 3 - demonstrate data class copy and destructuring with student list
data class Student(val name: String, val grade: Int)
fun printList(vararg students: Student) {
    println("Name   Grade")
    for((name, grade) in students) {
        println("${name.padEnd(6)} $grade")
    }
}
fun main() {
    val std1 = Student("Krish", 98)
    val std2 = std1.copy()
    val std3 = std1.copy(name = "Mano")
    printList(std1, std2, std3)
    println(std1 == std2)
    println(std2 == std3)
}