//https://www.tutorialspoint.com/design_pattern/facade_pattern.htm
interface Shape {
    fun draw()
}

class Rectangle : Shape {
    override fun draw() {
        println("Rectangle::draw()")
    }
}

class Square : Shape {
    override fun draw() {
        println("Square::draw()")
    }
}

class Circle : Shape {
    override fun draw() {
        println("Circle::draw()")
    }
}

class ShapeMaker {
    private val circle = Circle()
    private val rectangle = Rectangle()
    private val square = Square()

    fun drawCircle() {
        circle.draw()
    }

    fun drawRectangle() {
        rectangle.draw()
    }

    fun drawSquare() {
        square.draw()
    }

}

fun main() {
    val shapeMaker = ShapeMaker()
    shapeMaker.drawCircle()
    shapeMaker.drawRectangle()
    shapeMaker.drawSquare()
}
