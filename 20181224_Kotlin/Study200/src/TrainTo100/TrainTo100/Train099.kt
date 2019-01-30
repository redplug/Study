package TrainTo100.TrainTo100

/*
099 중첩 클래스(Nested Class)
 */

class Outer // 바깥 클래스
{
    class Nested // 중첩 클래스
    {
        fun hello() = println("중첩된 클래스")
    }
}

fun main() {
    val instance: Outer.Nested = Outer.Nested()
    instance.hello()
}