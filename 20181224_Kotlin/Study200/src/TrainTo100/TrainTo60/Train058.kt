package TrainTo100.TrainTo60

/*
058 프로퍼티와 Getter / Setter
Getter : 저장된 값을 읽으려고 할때 호출되는 함수
Setter : 값을 저장하려고 할떄 호출 되는 함수
val 프로퍼티에는 Getter만 존재 Setter를 정의하려고 하면 오류가 발생함.
 */

class Person2
{
    var age: Int = 0
        get()
        {
            return field
        }
        set(value)
        {
            field = if (value >= 0) value else 0
        }
}

fun main(args: Array<String>) {
    val person = Person2()
    person.age = -30
    println(person.age)
}