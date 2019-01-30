package TrainTo100.TrainTo90

/*
089 동반자 객체(Companion Object)
 */

class Person89 private constructor()
{
    companion object
    {
        fun create(): Person89
        {
            countCreated += 1
            return Person89()
        }

        var countCreated = 0
            private set
    }
}

fun main(args: Array<String>) {
    val a = Person89.create()
    val b = Person89.create()
    println(Person89.countCreated)
}
