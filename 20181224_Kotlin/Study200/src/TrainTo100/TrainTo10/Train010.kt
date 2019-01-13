package TrainTo100.TrainTo10

fun main(args: Array<String>): Unit
{
    var ch: Char = 'A'
    println(ch)

    ch = '\uAC00'
    println(ch)

    ch = '\u00B2' // 9733 16진수
    println(ch)

    ch = '\u2605' // 9733 16진수
    println(ch)


    ch = '한'
    println(ch.toInt())
    println(ch)
}