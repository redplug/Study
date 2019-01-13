package TrainTo100.TrainTo30

fun main(args: Array<String>): Unit
{
    val value: Int = if (10 > 5)
    {
        println("10은 5보다 크다.")
        10
    }
    else
    {
        println("10은 5보다 크지 않다.")
        5
    }
    println(value)

    val a = if(10 > 5){}
    else {}
    println(a)

    val b = if (10 > 5)
    {
        val c = 10
        println("참일떄 C의값은 $c")
    }
    else
    {
        val c = 5
        println("거짓일떄 C의값은 $c")
    }
    println("b의 값은$b")

}


/*
삼항 연산자?
삼항 연산자
조건식 ? 피연산자1 : 피연산자2

조건식의 연산결과가 true 이면, 결과는 피연산자 1이고, 조건식의 연산결과가 false 이면 결과는 피연산자2
        int b1 = (5>4) ? 50 : 40;
        //조건식이 true이므로 b1은 50이 된다.

 */