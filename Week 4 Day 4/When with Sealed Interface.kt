
sealed interface Shape {
    val area: Float
}

data class Circle(val radius: Int): Shape {
    override val area: Float = (Math.PI.toFloat())*radius*radius
}

data class Rectangle(val breadth: Int, val height: Int): Shape {
    override val area: Float = height*breadth.toFloat()
}

fun areaOfShapes(vararg shapes: Shape): Float {
    var sum: Float = 0f
    for(shape in shapes) {
        sum += shape.area
    }
    return sum
}
fun main() {
    val r1 = Rectangle(1, 2)
    details(r1)
    val r2 = r1.copy(breadth = 3)
    details(r2)
    val c = Circle(2)
    details(c)
    println("Area: ${areaOfShapes(r1, c, r2)}")
}
fun details(shape: Shape) {
    println(
        when(shape) {
            is Circle -> "It is a Circle with radius ${shape.radius}"
            is Rectangle -> "It is a Rectangle with ht: ${shape.height} wt: ${shape.breadth}"
        }
    )
}