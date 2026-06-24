// Week 3, Day 4 — BankAccount 2
class BankAccount(val name: String, var age: Int? = null, val initialBalance: Int = 0) {
    init {
        println("Welcome $name to Karimnagar District Bank")
    }

    var balance: Int = initialBalance
        private set

    fun accountDetails() {
        println("Account Details:\nName: $name\nAge: " + (age?.toString() ?: "Not Available") + "\n")
    }

    fun deposit(amount: Int) {
        balance += amount
        println("$amount has been added to your Account")
        accountDetails()
    }

    fun withdraw(amount: Int) {
        if(balance - amount >= 0) {
            balance -= amount
            println("$amount has been withdrawn from your Account")
        }else {
            println("Insufficient funds!")
        }
        accountDetails()
    }

    fun checkBalance() {
        println("Current balance is $balance")
    }
}

fun main() {
    val ac1 = BankAccount("Krishna Chaitanya")
    val ac2 = BankAccount("Mano Chaitanya", age = 16)
    val ac3 = BankAccount(
        "Kiran Gandhi",
        age = 44,
        initialBalance = 1116
    )

    println()

    // Operations on ac1
    ac1.accountDetails()
    ac1.deposit(500)
    ac1.deposit(1000)
    ac1.withdraw(300)
    ac1.checkBalance()

    println()

    // Operations on ac2
    ac2.accountDetails()
    ac2.deposit(2000)
    ac2.withdraw(2500)
    ac2.withdraw(500)
    ac2.checkBalance()

    println()

    // Operations on ac3
    ac3.accountDetails()
    ac3.checkBalance()
    ac3.deposit(884)
    ac3.withdraw(1000)
    ac3.withdraw(2000)
    ac3.checkBalance()
}