// Week 2, Day 3 — Animal inheritance hierarchy
open class Animal(val name: String) {
    open fun sound() {
        println("...")
    }
}
class Dog(name: String): Animal(name) {
    constructor(name: String, breed: String): this(name)
    override fun sound() {
        println("Boww..")
    }
}
class Cat(name: String): Animal(name) {
    override fun sound() {
        println("Meow..")
    }
}
class Mouse(name: String): Animal(name) {
    constructor(name: String, specialAbility: String): this(name)
    override fun sound() {
        println("squeaks and chirps..")
    }
}
fun main() {
    val obj1 = Dog("Rocky", breed = "Golden Retriever")
    val obj2 = Cat("Tom")
    val obj3 = Mouse("Jerry", specialAbility = "Tricks Tom..")

    val animals: List<Animal> = listOf(obj1, obj2, obj3)
    for(animal in animals) {
        print("A ${animal::class.simpleName} named ${animal.name} sounds ")
        animal.sound()
    }
}