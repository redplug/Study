package TrainTo100.TrainTo70

/*
067 프로퍼티를 오버라이딩하기
 */

open class AAA
{
    open var number = 10
        get()
        {
            println("AAA number Getter 호출됨")
            return field
        }
        set(value)
        {
            println("AAA number Setter 호출됨")
            field = value
        }
}

class BBB: AAA()
{
    override var number: Int
    get()
    {
        println("BBB number Getter 호출됨")
        return super.number
    }
    set(value)
    {
        println("BBB number Setter 호출됨")
        super.number = value
    }
}

fun main(args: Array<String>) {
    val test = BBB()
    test.number = 5
    test.number
}