fun main() {
    val square = Square(10)
    println(
        "The square of length ${square.side} has an area," + " ${square.area()} " +
                "and perimeter of ${square.perimeter()}"
    )

    /*val area = Area(10.5)
    val perimeter = Perimeter(10.5)
    println(
        "The square of length ${square.Side} has an area, " + "${area.execute()} and perimeter of ${perimeter.execute()}"
    )*/

    println("The sum of 2 and 3 is ${sum(2, 3)}")
    val a: Int = 3
    var b: Int = 5

    var result = a + b
    println("The sum of $a and $b is $result")

    b = 7
    result = a + b
    println("The sum of $a and $b is $result")

    /* this is inferred */
    val amount = 1200
    println("Amount = $amount")

    val interestRate = 2.5
    val time = 10
    val interest = (amount * interestRate * time) / 100
    println(
        "The interest on USD $amount at a rate of $interestRate% for $time years is $interest"
    )

    /* so we compute the total amount earned */
    val totalAmount = amount + interest
    println(
        "The total amount earn from USD $amount is $totalAmount at a rate of $interestRate% for $time years"
    )

    println("Max of $amount and $totalAmount is ${maxOf(amount, totalAmount.toInt())}")
    println("Min of $amount and $totalAmount is ${minOf(amount, totalAmount.toInt())}")


    val items = listOf("Bread", "biscuit", "Potato", "chicken")
    for (item in items) {
        println(item)
    }


    for ((item, index) in items.withIndex()) {
        println("${index + 1} => $item")
    }

    val averageScore = 29;
    println("The grade for the score, $averageScore, is ${getGrade(averageScore)}")
    for (x in 9 downTo 0 step 3) {
        print(x)
    }

    val shape = Shape(shape = ShapeType(3))
    shape.area()

    val cunt = Cunt(human = HumanData("Kevin", 23))
    cunt.eat()
}


// class Shape(private var shape: ShapeType) {
class Shape(private var shape: ShapeType) {
    init {
        println("This is a constructor")
    }

    fun area() {
        println(shape.size)
    }

    fun getSize() = shape.size


}

data class ShapeType(val size: Int)


fun getGrade(score: Int): String {
    return when (score) {
        in 75..100 -> "A"
        in 65..74 -> "B"
        in 55..64 -> "C"
        in 45..54 -> "D"
        else -> "Cunt"
    }
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

// classes are final by default so make them open for inheritance
// by pass the open keyword before the class to be inherited
/* class Square(side: Double) {
    val Side = side
    val area = side * side
    val perimeter = 4 * side
}*/

/*
class Area(side: Double) : Square(side) {
    fun execute(): Double {
        return this.Side * this.Side
    }
}

class Perimeter(side: Double) : Square(side) {
    fun execute(): Double {
        return 4 * this.Side
    }
}
*/
fun maxOf(firstNumber: Int, secondNumber: Int): Int {/* if (firstNumber > secondNumber) {
        return firstNumber
    } else {
        return secondNumber
    }
    */

    return if (firstNumber > secondNumber) {
        firstNumber
    } else {
        secondNumber
    }
}

fun minOf(a: Int, b: Int): Int = if (a < b) a else b