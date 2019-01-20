package TrainTo100.TrainTo70

/*
068 다형성(Polymorphism)의 활용
 */

open class AAAA
{
    open fun hello() = println("AAA 입니다.")
}

class BBBB: AAAA()
{
    override fun hello() = println("BBB 입니다.")
}

fun main(args: Array<String>) {
    val one = AAAA()
    val two = BBBB()
    val three: AAAA = two

    one.hello()
    two.hello()
    three.hello()
}