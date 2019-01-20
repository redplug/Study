package TrainTo100.TrainTo90

import java.util.concurrent.RecursiveAction

/*
082 접근 지정자(Access Modifier)
 */

class Rectangle(private val width: Int, private val height: Int)
{
    var area: Int = width * height
}

fun main(args: Array<String>) {
    val rect = Rectangle(5,7)
    // println(rect.width)
    println(rect.area)
}