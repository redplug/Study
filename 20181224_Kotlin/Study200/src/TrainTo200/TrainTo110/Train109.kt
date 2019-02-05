package TrainTo200.TrainTo110

/*
109 리시버가 붙은 함수 리터럴
리시버가 적용된 함수 리터럴을 만드는 방법
 */

fun main() {
    // Int 리시버를 [left, right] 범위 이내로 가공하여 반환하는 확장 함수
    val makeSure: Int.(left: Int, right: Int) -> Int

    makeSure = {left: Int, right: Int ->
        if (this < left) left
        else if (this > right) right
        else this
    }

    println(15.makeSure (20,40))
    println(18.makeSure(0,50))
    println(25.makeSure(0,19))
}

