package TrainTo100.TrainTo60

/*
055 intit 블록 나누어 쓰기
 */

class Size(width: Int, height: Int)
{
    val width = width
    val height: Int

    init {
        this.height = height
    }

    val area: Int

    init {
        area = width * height
    }
}

fun main(args: Array<String>) {
    val size = Size(10, 50)
    println(size.area)
}