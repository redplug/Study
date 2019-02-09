package TrainTo200.TrainTo120

/*
114 제네릭이 적용된 클래스/ 인터페이스 상속, 구현하기
 */

interface Plusable<T>
{
    operator fun plus(other: T): T
}

class Rectangle(val width: Int, val height: Int): Plusable<Rectangle>
{
    override fun plus(other: Rectangle) =
            Rectangle(width + other.width, height + other.height)

    override fun toString() = "width: $width, height: $height"
}

fun main() {
    val rect = Rectangle(10, 5)
    val rect2 = Rectangle(3, 8)

    println(rect + rect2)
}