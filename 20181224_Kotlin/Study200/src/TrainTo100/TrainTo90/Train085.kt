package TrainTo100.TrainTo90

/*
085 접근 지정자 오버라이딩
오버라이딩을 통해 protected인 프로퍼티나 맴버 함수의 접근 지정자를 public으로 변경할 수 있다.
 */

open class AAA2(protected open val number: Int)
{
    protected open fun hello()
    {
        println("hello")
    }
}

class BBB2(number: Int): AAA2(number)
{
    public override val number: Int
    get() = super.number

    public override fun hello() = super.hello()
}

fun main(args: Array<String>) {
    val b = BBB2(26)
    val a: AAA2 = b

    // println(a.number) // 에러
    // a.hello() // 에러
    println(b.number)
    b.hello()
}