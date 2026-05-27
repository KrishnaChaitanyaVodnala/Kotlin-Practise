// Week 2, Day 4 — Interface
interface Borrowable {
    val title: String
    fun borrow()
    fun returnItem()
}

class Book(override val title: String): Borrowable {
    override fun borrow() {
        println("The book named $title has been borrowed!")
    }
    override fun returnItem() {
        println("The book named $title has been returned!")
    }
}

class Magazine(override val title: String, val issue: Int): Borrowable {
    override fun borrow() {
        println("The magazine named $title (issue number: $issue) has been Borrowed!")
    }
    override fun returnItem() {
        println("The magazine named $title (issue number: $issue) has been Returned!")
    }
}

fun main() {
    val book = Book("Complete Works of Swami Vivekananda")
    val mag = Magazine("India Today", 22)

    println("Welcome to Karimnagar District Library\n")

    val library: List<Borrowable> = listOf(book, mag)

    println("Borrowing from Library")
    println("======================")
    for(item in library) {
        item.borrow()
    }

    println()

    println("Returning from Library")
    println("======================")
    for(item in library) {
        item.returnItem()
    }
}