package TrainTo100.TrainTo100

/*
093 Nullable 리시버
 */

fun String?.isNumber()
{
    if (this == null)
        println("문자열이 null입니다.")
}

fun main(args: Array<String>) {
    val empty: String? = null
    empty.isNumber()
}