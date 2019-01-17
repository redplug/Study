package TrainTo100.TrainTo60

/*
059 연산자 오버로딩(Operator Overloading)
 */

class Point(var x: Int = 0, var y: Int = 0)
{
    operator fun plus(other:Point): Point{
        return Point(x + other.x, y + other.y)
    }
    operator fun minus(other:Point): Point{
        return Point(x - other.x, y - other.y)
    }
    operator fun times(number: Int): Point{
        return Point(x * number, y * number)
    }
    operator fun div(number: Int): Point{
        return Point(x / number, y / number)
    }

    // 좌표를 출력한다.
    fun print()
    {
        println("x: $x, y: $y")
    }
}

fun main(args: Array<String>) {
    val pt1 = Point(3, 7)
    val pt2 = Point(2,-6)

    val pt3 = pt1 + pt2
    val pt4 = pt3 * 6
    val pt5 = pt4 / 5

    pt3.print()
    pt4.print()
    pt5.print()
}