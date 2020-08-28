
class Rectangle {
    fun draw() {
        println("Rectangle::draw()")
    }
}

class Square{
    fun draw() {
        println("Square::draw()")
    }
}

class Circle {
    fun draw() {
        println("Circle::draw()")
    }
}

object ShapeMaker {
    val circle = Circle()
    val rectangle = Rectangle()
    val square = Square()

}

// for example use on DAO and network?
fun main() {
    ShapeMaker.circle.draw()
    ShapeMaker.rectangle.draw()
    ShapeMaker.square.draw()
}
