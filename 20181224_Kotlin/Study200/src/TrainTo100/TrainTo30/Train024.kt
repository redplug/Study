package TrainTo100.TrainTo30

fun main(args: Array<String>): Unit
{
    val score = 95

    val grade: Char = when (score / 10)
    {
        6 -> 'D'
        7 -> 'C'
        8 -> 'B'
        9,10 -> 'A'
        else -> 'F'
    }
    println(grade)
// if-else 처럼 사용 하는 방법
    val score2 = 75

    val grade2: Char = when
    {
        score2 >= 90 -> 'A'
        score2 >= 80 -> 'B'
        score2 >= 70 -> 'C'
        score2 >= 60 -> 'D'
        else -> 'F'
    }
    println(grade2)
}