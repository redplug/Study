package TrainTo100.TrainTo60

/*
056 생성자와 프로퍼티 한번에 쓰기
 */

class Car(val name: String, val speed: Int = 0)

fun main(args: Array<String>) {
    val car = Car("My car")
    println(car.name)
    println(car.speed)
}