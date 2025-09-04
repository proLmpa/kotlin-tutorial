package org.example.factory

// Product (인터페이스)
interface Shape {
    fun draw()
}

// Concrete Products
class Circle : Shape {
    override fun draw() = println("Circle")
}

class Square : Shape {
    override fun draw() = println("Square")
}

// Factory
object ShapeFactory {
    fun createShape(type: String): Shape? {
        return when (type.lowercase()) {
            "circle" -> Circle()
            "square" -> Square()
            else -> null
        }
    }
}

fun main() {
    val circle = ShapeFactory.createShape("circle")
    circle?.draw()

    val square = ShapeFactory.createShape("square")
    square?.draw()
}