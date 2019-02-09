package TrainTo200.TrainTo120

/*
119 흐름 제어-반복문 for
 */

fun main() {
    for (i: Int in 1..10)
            println("$i")
    println()

    for(i: Int in 1..10)
    {
        if (i > 5)
            break
        println("$i ")
    }
}