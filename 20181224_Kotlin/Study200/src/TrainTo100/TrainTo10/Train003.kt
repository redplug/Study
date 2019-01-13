package TrainTo100.TrainTo10

fun main(args: Array<String>): Unit
{
    var total: Int // 변수 선언_ var 키워드, total 식별자, Int 변수타입
    total = 0 // 변수에 대한 값을 기입
    println(total)

    val a: Int = 10 + 53 - 7 // 변수 선언 후 값을 바로 기입하는 것도 가능
    println(a)

    val b: Int = 43 + 75 + a
    println(b)

    total = a + b
    println(total)

}
/*
1. 원시타입?
2. 낙타 표기법 확인
3. 변수 표기법은 3가지(낙타 표기법, 파스칼 표기법, 뱀표기법) 정도 있으며 코틀린에서는 낙타 표기법을 주로 사용
4. var, val 차이점 : 일반변수와 불변 변수(?)
 */
