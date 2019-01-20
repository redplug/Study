package TrainTo100.TrainTo70

/*
066 오버라이딩(Overriding)
 */

open class AAA2
{
    open fun func() = println("AAA")
}

class BBB2: AAA2()
{
    override fun func()
    {
        super.func()
        println("BBB")
    }
}

fun main(args: Array<String>) {
    AAA2().func()
    BBB2().func()
}