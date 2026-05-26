// Week 2, Day 3 — Animal inheritance hierarchy
open class Animal(val name: String) {
    open fun sound() {
        println("...")
    }
}
class Dog(name: String): Animal(name) {
    override fun sound() {
        println("Boww..")
    }
    var breed: String = ""
}
class Cat(name: String): Animal(name) {
    override fun sound() {
        println("Meow..")
    }
}
class Mouse(name: String): Animal(name) {
    override fun sound() {
        println("squeaks and chirps..")
    }
    var specialAbility: String = ""
}
fun main() {
    val obj1 = Dog("Rocky").apply {
        breed = "Golden Retriever"
    }
    val obj2 = Cat("Tom")
    val obj3 = Mouse("Jerry").apply {
        specialAbility = "Tricks Tom.."
    }

    val animals: List<Animal> = listOf(obj1, obj2, obj3)
    for(animal in animals) {
        print("A ${animal::class.simpleName} named ${animal.name} sounds ")
        animal.sound()
    }
}