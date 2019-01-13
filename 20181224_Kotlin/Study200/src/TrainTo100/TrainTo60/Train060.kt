package TrainTo100.TrainTo60

/*
060 번호 붙은 접근 연산자(Indexed Access Operator) []
 */

class Person60(var name: String, var birthday: String)
{
    operator fun get(position: Int): String
    {
        return when (position) {
            0 -> name
            1 -> birthday
            else -> "알수없음"
        }
    }
    operator fun set(position: Int, value: String)
    {
        when (position)
        {
            0 -> name = value
            1 -> birthday = value
        }
    }
}

fun main(args: Array<String>) {
    val person = Person60("Kotlin", "2016-02-15")
    println(person[0]) // 값을 읽어옴 get
    println(person[1])
    println(person[-1])

    person[0] = "JAVA" // 값을 변경 set
    person[1] = "2011-01-01"
    println(person.name)
    println(person.birthday)
}

