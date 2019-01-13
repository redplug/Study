package TrainTo100.TrainTo20

fun main(args: Array<String>): Unit
{
    var str: String = "Hello"
    println(str) // Hello 출력

    str = str + "\nKotlin!" // \n 줄바꿈 추가
    println(str) // hello 줄바꿈 Kotlin! 출력

    println(str[8]) // h/e/l/l/o/줄바꿈/K/o/t

    val num = 10 * 5 + 3 // 53
    println(str + num) // hello 줄바꿈 Kotlin!53 출력 String와 과 다른 타입을 + 할 경우 String로 합침
    println("Greate"[1])
}