// Week 2, Day 4 — Abstract Class
abstract class Borrowable(open val title: String) {
    companion object {
        var borrowCount: Int = 0
    }
    abstract fun borrow()
    abstract fun returnItem()
}

class Book(override val title: String): Borrowable(title) {
    override fun borrow() {
        borrowCount++
        println("The book named $title has been borrowed!")
    }
    override fun returnItem() = println("The book named $title has been returned!")
}

class Magazine(override val title: String, val issue: Int): Borrowable(title) {
    override fun borrow() {
        borrowCount++
        println("The magazine named $title (issue number: $issue) has been Borrowed!")
    }
    override fun returnItem() = println("The magazine named $title (issue number: $issue) has been Returned!")
}

fun main() {
    val book = Book("Complete Works of Swami Vivekananda")
    val mag = Magazine("India Today", 22)

    println("Welcome to Karimnagar District Library\n")

    val library: List<Borrowable> = listOf(book, mag)

    println("Borrowing from Library")
    println("=".repeat(22))
    for(item in library) {
        item.borrow()
    }

    println("\nNumber of Borrows: ${Borrowable.borrowCount}\n")

    println("Returning from Library")
    println("=".repeat(22))
    for(item in library) {
        item.returnItem()
    }
}