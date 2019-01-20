package TrainTo100.TrainTo80

import TrainTo100.TrainTo60.Building


/*
076 안전한 호출 연산자(Safe Call Operator) ?.
 */

fun main(args: Array<String>) {
    var obj: Building? = null
    obj?.print()
    obj?.name = "건물"

    obj = Building()
    obj?.name = "서울월드컵경기장"
    obj?.date = "2001년 11월 10일"
    obj?.area = 21_6712
    obj?.print()
}

