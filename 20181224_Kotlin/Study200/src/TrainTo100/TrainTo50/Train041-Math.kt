package TrainTo100.TrainTo50

// a와 b 중에 더 큰 수를 반환하는 함수
fun max(a: Int, b: Int): Int = if (a > b) a else b

// a와 b 주에 더 작은수를 반환하는 함수
fun min(a: Int, b: Int): Int = if (a < b) a else b

// num 의 절대 값을 반환하는 함수
fun abs(num: Int): Int = if(num >= 0) num else -num