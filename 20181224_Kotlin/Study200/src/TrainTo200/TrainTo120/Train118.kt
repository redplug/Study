package TrainTo200.TrainTo120

/*
118 반복자(Iterator)
 */

fun main() {
    val range: IntRange = 1..3
    val iter: Iterator<Int> = range.iterator()

    println(iter.hasNext())
    println(iter.next())
    println(iter.hasNext())
    println(iter.next())
    println(iter.hasNext())
    println(iter.next())
    println(iter.hasNext())
}