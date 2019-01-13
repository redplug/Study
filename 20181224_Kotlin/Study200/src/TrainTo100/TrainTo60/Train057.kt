package TrainTo100.TrainTo60

/*
057 보조 생성자(Secondary Constructor)
 */

class Time(val second: Int) {
    init {
        println("init 블록 실행중")
    }

    //보조 생성자1
    constructor(minute: Int, second: Int): this(minute * 60 + second)
    {
        println("보조 생성자1 실행중")
    }

    //보조 생성자2
    constructor(hour: Int, minute: Int, second: Int): this(hour * 60, minute * 60 + second)
    {
        println("보조 생성자2 실행중")
    }
    init {
        println("또다른 init 블록 실행중")
    }
}

fun main(args: Array<String>) {
    println("${Time(15,6).second} 초")
    println("${Time(6,15,6).second} 초")
}