package TrainTo100.TrainTo100

/*
098 다이아몬드 문제(The Diamond Problem)
 */

interface Parent { fun follow(): Unit}

interface Mother : Parent
{
    override fun follow() = println("follow his mother")
}

interface Father : Parent
{
    override fun follow() = println("follow his Father")
}

class Child: Mother, Father
{
    override fun follow()
    {
        println("A child decided to")
        super<Mother>.follow()
    }
}

fun main() {
    Child().follow()
}