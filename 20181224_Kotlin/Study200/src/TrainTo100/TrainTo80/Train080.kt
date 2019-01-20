package TrainTo100.TrainTo80
import TrainTo100.TrainTo70.Person
import TrainTo100.TrainTo70.Student

/*
080 is 연산자
 */

class Professor(name: String, age: Int): Person(name, age)

fun main(args: Array<String>) {
    val person: Person = Student("Mark Zuckerberg", 33, 20171225)
    println("${person is Person}")
    println("${person is Student}")
    println("${person is Professor}")

    val person2: Person = Professor("Kim", 33)
    println("${person2 is Person}")
    println("${person2 is Student}")
    println("${person2 !is Professor}")

}