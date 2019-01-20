package TrainTo100.TrainTo70

/*
069 클래스를 상속하는 객체
 */

open class Person3(val name: String, val age: Int)
{
    open fun print()
    {
        println("이름:$name")
        println("나이:$age")
    }
}

fun main(args: Array<String>) {
    val custom: Person3 = object : Person3("Alan",23)
    {
        override fun print()
        {
            println("It's a object")
        }
    }
    custom.print()
}