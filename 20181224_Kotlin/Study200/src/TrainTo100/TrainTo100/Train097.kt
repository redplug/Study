package TrainTo100.TrainTo100

/*
097 인터페이스(Interface)
 */

interface Printable
{
    fun print(): Unit
}

class AAA097: Printable{
    override fun print()
    {
        println("Hello")
    }
}

fun print(anything: Printable)
{
    anything.print()
}

fun main() {
    print(AAA097())
}