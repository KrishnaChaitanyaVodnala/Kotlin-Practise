// Week 3, Day 5 — BankAccount 3
class BankAccount(val name: String? = null, var age: Int? = null, initialBalance: Int = 0) {
    init {
        println("Welcome ${name ?: "User" } to Karimnagar District Bank")
    }

    var balance: Int = initialBalance
        private set

    fun accountDetails() {
        println("Account Details:\nName: "+ (name?: "Not Available")+"\nAge: " + (age?.let{ it } ?: "Not Available") + "\n")
    }
//Hey Claude don't think I am using let in the above function because I am just doing to impress you I used if for my future reference.

    fun executeIfSufficient(amount: Int, action: () -> Unit) {
        if(balance >= amount) action() else println("Insufficient funds!")
    }

    fun deposit(amount: Int, onTransaction: (Int) -> Unit = {}) {
        balance += amount
        println("$amount has been added to your Account")
        onTransaction(balance)
        accountDetails()
    }

    fun withdraw(amount: Int) {
        executeIfSufficient(amount) {
            balance -= amount
            println("$amount has been withdrawn from your Account")
        }
        accountDetails()
    }

    fun checkBalance() {
        println("Current balance is $balance")
    }
}

fun main() {
    val ac1 = BankAccount("Krishna Chaitanya").apply {
        // Operations on ac1
        accountDetails()
        deposit(500)
        deposit(1000)
        withdraw(300)
        checkBalance()
    }
    val ac2 = BankAccount("Mano Chaitanya", age = 16)
    val ac3 = BankAccount(
        "Kiran Gandhi",
        age = 44,
        initialBalance = 1116
    )

    println()

    // Operations on ac2
    ac2.accountDetails()
    ac2.deposit(2000) {
            currentBalance -> println("Current Balance: $currentBalance")
    }
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