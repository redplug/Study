package TrainTo100.TrainTo90

/*
088 객체 선언
 */

object Person88
{
    var name: String = ""
    var age: Int = 0
    fun print()
    {
        println(name)
        println(age)
    }
}

fun main(args: Array<String>) {
    // 식별자 Person88으로 객체에 바로 접근 가능
    Person88.name = "Singleton"
    Person88.age = 55
    Person88.print()
}
