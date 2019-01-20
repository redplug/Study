package TrainTo100.TrainTo80

/*
079 스마트 캐스팅
 */

fun main(args: Array<String>) {
    val number: Int? = null
    val number2: Int = 1225

    checkNull(number)
    checkNull(number2)
}

fun checkNull(any: Any?)
{
    if(any == null)
    {
        println("Null이 들어왔습니다.")
        return
    }

    println(any.toString())
}