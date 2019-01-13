package TrainTo100.TrainTo50

/*
047 클래스(class)

    val person2 = Person()
    person2.name = "김미영"
    person2.age = 28

    val person3 = Person()
    person3.name = "John"
    person3.age = 52
    책이 오타인가??
 */

class Person
{
    var name: String = ""
    var age:Int = 0
}

fun main(args: Array<String>) {
    val person: Person
    person = Person()
    person.name = "홍길동"
    person.age = 36

    val person2 = Person()
    person2.name = "김미영"
    person2.age = 28

    val person3 = Person()
    person3.name = "John"
    person3.age = 52

    println(person.name)
    println(person.age)
    println(person2.name)
    println(person2.age)
    println(person3.name)
    println(person3.age)
}