package TrainTo100.TrainTo60

/*
051 ===, !== 연산자
=== : 두 참조변수가 같은 객체를 가리키고 있는지 여부를 조사하는 연산자
!== : ===와 반대로 두 참조변수가 다른 객체를 가리키고 있는지 여부를 조사하는 연산자
String 타입의 리터럴로 이루어진 표현식에 한해 참조 변수에 동일한 문자열을 저장하면
 컴파일러는 매번 새로운 문자열을 생성하지 않고 하나의 문자열을 가리키도록 만든다.
 단 리터럴로만 이루어지지 않은 표현식인 경우 동일한 것을 가르키지 않음
 */

fun main(args: Array<String>) {
    var a = "one"
    var b = "one"

    println(a === b)

    b = "on"
    b += "e"
    println(a !== b)
    println(a === b)

    b = a
    println(a === b)
}



