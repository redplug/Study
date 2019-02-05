package TrainTo200.TrainTo110

/*
107 고차 함수(Higher-order Function)
 */

fun decorate(task:() -> Unit){
    println("=== 작업시작 ===")
    task()
    println("=== 작업끝 ===")
}

fun main() {
    decorate({
        val a = 10; val b = 5
        println("$a + $b = ${a + b}")
    })
    decorate({
        println("some"); println("tasks")
    })
}