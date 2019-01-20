package TrainTo100.TrainTo90
import TrainTo100.TrainTo70.Person2
import TrainTo100.TrainTo70.Student2

/*
081 as 연산자와 다운캐스팅
 */

fun main(args: Array<String>) {
    val person: Person2 = Student2("John",32,20171218)
    val person2: Person2 = Person2("jack",29)

    var person3: Student2 = person as Student2
    person3 = person2 as Student2
}

