package TrainTo100.TrainTo100

/*
100 내부 클래스(Inner Class)
 */

class Outer100(private val value: Int)
{
    fun print()
    {
        println(this.value)
    }

    inner class Inner(private val  innerValue: Int)
    {
        fun print()
        {
            this@Outer100.print()
            println(this.innerValue + this@Outer100.value)
        }
    }
}

fun main() {
    val instance: Outer100 = Outer100(610)
    val innerInstance: Outer100.Inner = instance.Inner(40)
    innerInstance.print()
}