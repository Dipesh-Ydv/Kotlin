// There are total 4 visibility modifiers
// 1. Public : element visible to everyone
// 2. Private : element visible to the class only
// 3. Protected : element visible to class and it's subclasses
// 4. Internal : element will be visible throughout the same variable
class BankAccount {
    // here private specify that we can use variable only inside the class
    private var balance = 0.0
    fun deposit(amount: Double) {
        //..
        balance += amount
    }
    fun withdraw(amount: Double) {
        //..
        balance -= amount
    }
}
open class Ship {
    // only it's subclass can access this variable
    protected var milesPassed = 0.0
    fun printMilesPassed() {
        println(milesPassed)
    }
}
class ElectricShip : Ship() {
    fun swimUsingEngine(distance : Double) {
        milesPassed += distance
    }
}
fun main() {
    val account = BankAccount()
    account.deposit(1002.33)
    account.withdraw(232.43)
//    account.balance = 322.32          // It will generate error

    val ship = ElectricShip()
    ship.swimUsingEngine(11.2)
    ship.printMilesPassed()
}