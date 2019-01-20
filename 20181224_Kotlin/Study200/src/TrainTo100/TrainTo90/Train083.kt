package TrainTo100.TrainTo90

/*
083 접근 지정자: private
 */

fun main(args: Array<String>) {

// num = 5 // 에러
    hello(15)

    val person = Person(10)
    println(person.age)
//person.age = 20 // 에러

    println(person.isYoung)
}