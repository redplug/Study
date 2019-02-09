package TrainTo200.TrainTo120

/*
117 .. 연산자와 범위 표현식(Range Expression)
 */

fun main() {
    val oneToTen: IntRange = 1..10 // 1~10까지
    println(5 in oneToTen)

    val upperAtoZ: CharRange = 'A'..'Z'
    if('C' in upperAtoZ)
            println("대문자입니다.")

    if('p' in 'a'..'z')
            println("소문자입니다.")
}