package TrainTo200.TrainTo110

/*
101 데이터 클래스(Data Class)
데이터에 특화된 클래스
 */

// 데이터 클래스를 선언
data class Employee(
    val name: String,
    val age: Int,
    val salary: Int)

fun main() {
    val first = Employee("John",30,3000)
    val second = Employee("Page",24,5300)
    val third = first.copy() // 데이터 클래스를 선언해서 copy함수가 자동으로 선언됨.

    println(first.toString())
    println(third.toString())
    println(first==second)
    println(first==third)
}
