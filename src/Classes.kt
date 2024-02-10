data class HumanData(val name: String, val age: Int) {
    fun drink() {
        println("This human piss of shit is $age years old")
    }
}

open class Human(private val human: HumanData) {
    open fun eat() {
        println("${human.name} likes chicken")
        human.drink()

    }
}

class Cunt(private val human: HumanData) : Human(human) {
    override fun eat() {
        super.eat()
        println("${human.name} likes chicken and burgers")
    }
}

class Square(val side: Int) {
    fun area() = side * side
    fun perimeter() = 4 * side
}
