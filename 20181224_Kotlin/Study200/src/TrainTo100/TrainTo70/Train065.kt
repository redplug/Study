package TrainTo100.TrainTo70

/*
065 업캐스팅(Upcasting)
 */

open class Person2(val name: String, val age: Int)

class Student2(name: String, age: Int, val id: Int): Person2(name, age)

fun main(args: Array<String>) {
    val person2: Person2 = Student2("John",32,20171212)
}