package TrainTo200.TrainTo120

import sun.awt.SunHints

/*
115 특정 타입을 상속, 구현하는 타입만 인수로 받기
 */

interface ValueContainer
{
    fun getValue(): Int
}

class AAA: ValueContainer
{
    override fun getValue(): Int = 1102
}

class BBB: ValueContainer
{
    override fun getValue(): Int = 127
}

fun <T: ValueContainer> T.printVlaue(){
    println(this.getValue())
}

fun main() {
    AAA().printVlaue()
    BBB().printVlaue()
}