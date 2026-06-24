// Week 2, Day 2 — Constructors and Init
class bankAccount(val name: String) {
    init {
        println("Welcome $name to XYZ Bank")
    }

    var age: Int = 0
    var balance: Int = 0

    constructor(name: String, age: Int): this(name) {
        this.age = age
    }

    constructor(name: String, age: Int, balance: Int): this(name) {
        this.age = age
        this.balance = balance
    }

    fun deposit(amount: Int) {
        balance += amount
        println("Your current balance is $balance")
    }

    fun Withdraw(amount: Int) {
        if(balance - amount >= 0) {
            balance -= amount
            println("Your current balance is $balance")
        }else {
            println("Insufficient funds!")
        }
    }

    fun checkBalance() {
        println("Your current balance is $balance")
    }
}

fun main() {
    val ac1 = bankAccount("Krishna")
    val ac2 = bankAccount("Mano", 16)
    val ac3 = bankAccount("Kiran", 44, 1116)

    println()

    // Operations on ac1
    ac1.deposit(500)
    ac1.deposit(1000)
    ac1.Withdraw(300)
    ac1.checkBalance()

    println()

    // Operations on ac2
    ac2.deposit(2000)
    ac2.Withdraw(2500)
    ac2.Withdraw(500)
    ac2.checkBalance()

    println()

    // Operations on ac3
    ac3.checkBalance()
    ac3.deposit(884)
    ac3.Withdraw(1000)
    ac3.Withdraw(2000)
    ac3.checkBalance()
}