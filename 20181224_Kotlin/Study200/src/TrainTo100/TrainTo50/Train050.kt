package TrainTo100.TrainTo50

/*
050 가비지 컬렉션(Garbage Collection)
쓰레기수거, 발생한 미아 객체(참조 변수와 연결이 끊어진 객체)를 수거하는 기능
적당한 시점이란?
미아 객체를 탐색하게 되면 순간적으로 프로그램이 멈추는 현상이 발생할 수 있음.
*/

fun main(args: Array<String>) {
    var result = ""
    var i = 1

    while (i <= 100)
    {
        result += "$i "
        i += 1
    }
    println(result)
}
