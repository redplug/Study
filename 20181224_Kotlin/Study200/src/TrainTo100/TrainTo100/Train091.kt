package TrainTo100.TrainTo100

/*
091 const
 */

const val hello = "Hello" + "World"

object Foo
{
    const val bar = "bar"
}

fun main(args: Array<String>) {
    println(hello)
    println(Foo.bar)
    println(hello)
    println(Foo.bar)
}