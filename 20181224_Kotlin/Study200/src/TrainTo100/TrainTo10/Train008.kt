package TrainTo100.TrainTo10

fun main(args: Array<String>): Unit
{
    val a: Byte = 125
    val b: Short = (100 + 200) * 100
    println("b = " + b)
    var c: Int = 12_4354_6538
    println("c = " + c)
    c = 0xFF_88_88
    println("c = " + c)
    c = 0b01010010_01100011_01110101_01000101
    println("c = " + c)
    var d: Long = -543_7847_3984_7238_4723
    println("d = " + d)
    c = a + b
    println("c = " + c)
    println("d = " + d)
    d = c + 10L
    println("d = " + d)

    var e: Float = 67.6f
    println("e = " + e)
    var f: Double = 658.456
    println("f = " + f)

    e = (e + f).toFloat()
    println(e)
}

/*
값이 726.05597로 나옴.... ????
 */