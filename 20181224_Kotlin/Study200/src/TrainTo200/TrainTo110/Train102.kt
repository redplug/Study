package TrainTo200.TrainTo110

/*
102 객체 분해하기
데이터 클래스의 인스턴스에 한해, 객체를 여러개의 변수로 쪼개는 것이 가능하다.
 */

data class Employee102(val name:String, val age:Int, val salary:Int)


fun main() {
    val (name, _, salary) = Employee102("John",30, 3300)
    println(name); println(salary)
}