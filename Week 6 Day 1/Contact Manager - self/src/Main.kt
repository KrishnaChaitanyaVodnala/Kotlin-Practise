// Week 6, Day 1 - Contact Manager - self
class ContactsManager {
    data class Contact(val name: String, val phone: String)

    val contactBook = mutableSetOf<Contact>()

    fun addContact(name: String, phone: String) {
        if(!contactBook.add(Contact(name, phone))) {
            println("Contact already exists")
        } else {
            println("Added contact $name ($phone)")
        }
        println()
    }

    fun search(name: String) {
        val result = contactBook.find { it.name.equals(name, ignoreCase = true)}
        if(result == null) {
            println("No Contact Found")
        } else {
            println("Found ${result.phone}")
        }
        println()
    }

    fun deleteContact(name: String) {
        val result = contactBook.find { it.name.equals(name, ignoreCase = true) }
        if(result == null) {
            println("No Contact Found")
        } else {
            contactBook.remove(result)
            println("Contact Deleted")
        }
        println()
    }

    fun displayContacts() {
        if(contactBook.isEmpty()) {
            println("No Contacts Found")
        } else {
            for(contact in contactBook) {
                println("${contact.name} - ${contact.phone}")
            }
        }
        println()
    }
}

fun main() {
    val manager = ContactsManager()
    manager.displayContacts()
    manager.addContact("Mickey", "123")
    manager.addContact("Krish", "345")
    manager.displayContacts()
    manager.search("Krish")
    manager.search("Mano")
    manager.deleteContact("Krish")
    manager.deleteContact("Mano")
    manager.addContact("Mickey", "123")
    manager.displayContacts()
}