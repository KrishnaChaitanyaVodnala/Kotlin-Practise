// Week 4, Day 3 — rewrite Book as data class with availability tracking and library system

- moved isAvailable to class body to exclude from equals/hashCode
- replaced .get() with indexed access throughout
- replaced size == 0 checks with isEmpty()

data class Book(val title: String, val author: String) {
    var isAvailable: Boolean = true
}

class Member(val name: String, val id: Int) {
    init {
        println("Member: $name added to the System")
    }
    val booksBorrowed = mutableListOf<Book>()

    fun borrowBook(book: Book): Boolean {
        if(book.isAvailable) {
            booksBorrowed.add(book)
            book.isAvailable = false
            return true
        }
        return false
    }

    fun returnBook(book: Book) {
        booksBorrowed.remove(book)
        book.isAvailable = true
        println("Member: $name returned the book: ${book.title}\n")
    }

    fun totalBooksBorrowed() {
        println("Books borrowed by $name are:")
        if(booksBorrowed.isEmpty()) {
            println("None\n")
            return
        }
        for(book in booksBorrowed) {
            println("-> ${book.title}")
        }
        println()
    }
}

class Library(val name: String) {
    init{
        println("== Welcome to $name Library ==\n")
    }
    val books = mutableListOf<Book>()

    val members = mutableListOf<Member>()

    fun addBook(title: String, author: String) {
        books.add(Book(title, author))
    }
    fun registerMember(name: String, id: Int) {
        members.add(Member(name, id))
    }
    fun availableBooks() {
        println("Available books:")
        if(books.isEmpty()) {
            println("None\n")
            return
        }
        for(book in books) {
            if(book.isAvailable) {
                println("-> ${book.title}")
            }
        }
        println()
    }
}

fun main() {
    val lib = Library("Karimnagar District")

    lib.addBook("Ramayana", "Vishwanath Satyanarayana")
    lib.addBook("The wings of fire", "APJ Abdul Kalam")
    lib.addBook("Sowndaryalahari", "Adi Shankaracharya")

    lib.registerMember("Krishna", 0)
    lib.registerMember("Mano", 1)
    println()

    lib.availableBooks()

    if(lib.members[0].borrowBook(lib.books[0])) {
        println("${lib.members[0].name} borrowed a Book named ${lib.books[0].title}")
    }else {
        println("Member: ${lib.members[0].name} is trying to borrow a book: ")
        println("The book is currently unavailable")
    }
    println()

    lib.availableBooks()

    if(lib.members[1].borrowBook(lib.books[1])) {
        println("${lib.members[1].name} borrowed a Book named ${lib.books[1].title}")
    }else {
        println("Member: ${lib.members[1].name} is trying to borrow a book: ")
        println("The book is currently unavailable")
    }
    println()

    if(lib.members[0].borrowBook(lib.books[1])) {
        println("${lib.members[0].name} borrowed a Book named ${lib.books[1].title}")
    }else {
        println("Member: ${lib.members[0].name} is trying to borrow a book: ")
        println("The book is currently unavailable")
    }
    println()

    lib.availableBooks()

    if(lib.members[0].borrowBook(lib.books[2])) {
        println("${lib.members[0].name} borrowed a Book named ${lib.books[2].title}")
    }else {
        println("Member: ${lib.members[0].name} is trying to borrow a book: ")
        println("The book is currently unavailable")
    }
    println()

    lib.members[0].totalBooksBorrowed()

    lib.members[0].returnBook(lib.books[0])
    lib.members[1].returnBook(lib.books[1])
    lib.members[0].returnBook(lib.books[2])

    lib.availableBooks()
}