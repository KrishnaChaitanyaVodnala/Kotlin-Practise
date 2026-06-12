// Week 4, Day 4 -- build contacts manager using data class, MutableMap keyed by phone, find, and removeIf
data class Contact(val name: String, val phone: String, val email: String) 

fun search(name: String, map: Map<String, Contact>) {
    println(
        map.entries.find {
            it.value.name.equals(name, ignoreCase = true)
        }?.value ?: "Not found"
    )
}

fun delete(name: String, map: MutableMap<String, Contact>) {
    val entry = map.entries.find {
        it.value.name.equals(name, ignoreCase = true)
    }
    
    if(entry != null) {
        map.remove(entry.key)
    }
}

fun printList(map: Map<String, Contact>) {
    map.forEach {
        println(it.value)
    }
}

fun main() {
    val map = mutableMapOf<String, Contact>()
    
    
    // Test 1: Object creation
    println("=== Test 1: Object Creation ===")
    val c1 = Contact("Krishna", "9876543210", "krishna@gmail.com")
    println(c1)
    println()

    // Test 2: Add contacts
    println("=== Test 2: Add Contacts ===")
    val c2 = Contact("Krishna", "111", "k@gmail.com")
    val c3 = Contact("Mano", "222", "m@gmail.com")
    val c4 = Contact("Chaitanya", "333", "c@gmail.com")

    map[c1.phone] = c1
    map[c2.phone] = c2
    map[c3.phone] = c3
    map[c4.phone] = c4

    printList(map)
    println()

    // Test 3: Search existing contact
    println("=== Test 3: Search Existing ===")
    search("Krishna", map)
    println()

    // Test 4: Search non-existing contact
    println("=== Test 4: Search Non-Existing ===")
    search("Ram", map)
    println()

    // Test 5: Delete existing contact
    println("=== Test 5: Delete Existing ===")
    delete("Mano", map)
    printList(map)
    println()

    // Test 6: Delete non-existing contact
    println("=== Test 6: Delete Non-Existing ===")
    delete("Ram", map)
    printList(map)
    println()

    // Test 7: Search after delete
    println("=== Test 7: Search After Delete ===")
    search("Mano", map)
    println()
}