// Week 4, Day 5 - build contacts manager using data class, MutableList, find, and removeIf
data class Contact(val name: String, val phone: String, val email: String) 

fun search(name: String, list: List<Contact>) {
    println(
        list.find {
            it.name == name
        }?: "Not found"
    )
}

fun delete(name: String, list: MutableList<Contact>) {
    list.removeIf {
        it.name.equals(name, ignoreCase = true)
    }
}

fun printList(list: List<Contact>) {
    list.forEach {
        println(it)
    }
}

fun main() {
    val list = mutableListOf<Contact>()

    // Test 1: Object creation
    println("=== Test 1: Object Creation ===")
    val c1 = Contact("Krishna", "9876543210", "krishna@gmail.com")
    println(c1)
    println()

    // Test 2: Add contacts
    println("=== Test 2: Add Contacts ===")
    list.add(Contact("Krishna", "111", "k@gmail.com"))
    list.add(Contact("Mano", "222", "m@gmail.com"))
    list.add(Contact("Chaitanya", "333", "c@gmail.com"))
    printList(list)
    println()

    // Test 3: Search existing contact
    println("=== Test 3: Search Existing ===")
    search("Krishna", list)
    println()

    // Test 4: Search non-existing contact
    println("=== Test 4: Search Non-Existing ===")
    search("Ram", list)
    println()

    // Test 5: Delete existing contact
    println("=== Test 5: Delete Existing ===")
    delete("Mano", list)
    printList(list)
    println()

    // Test 6: Delete non-existing contact
    println("=== Test 6: Delete Non-Existing ===")
    delete("Ram", list)
    printList(list)
    println()

    // Test 7: Search after delete
    println("=== Test 7: Search After Delete ===")
    search("Mano", list)
    println()
}