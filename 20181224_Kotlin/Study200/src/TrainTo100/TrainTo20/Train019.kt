package TrainTo100.TrainTo20

fun main(args: Array<String>): Unit
{
    var a = 15
    val b = 11

    if(a>b)
    {
        println("if문 안으로 들어옴")
        a -= b
    }

    println(a)

    if(a<b) //  4 < 11이어서 true if문 안에 내용이 실행됨.
        println("if문의 한문장일 경우에 중괄호를 생략할 수 있음")
}