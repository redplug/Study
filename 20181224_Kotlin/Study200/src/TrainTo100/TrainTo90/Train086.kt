package TrainTo100.TrainTo90

/*
086 확장 함수(Extension Function)
상속 없이 클래스 외부에서 맴버 함수를 추가할 수 있다.
 */

// 문자열이 숫자로만 이루어져있는지 판단하는 확장 함수
fun String.isNumber(): Boolean
{
    var i = 0
    while (i < this.length)
    {
        // 숫자가 아닌 문자가 하나라도 들어있으면 false 반환
        if(!('0' <= this[i] && this[i] <= '9'))
            return false
        i += 1
    }
    // 모든 조건을 통과하면 true 반환
    return true
}

fun main(args: Array<String>) {
    println("1234567890".isNumber())
    println("500원".isNumber())
}