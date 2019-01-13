package programmers

fun main(args: Array<String>) {

    //val (a, b) = readLine()!!.split(' ').map(String::toInt)
    var a: Int = 3
    var b: Int = 5

    var i: Int = 0
    while (i < b) {
        var j: Int = 0
        while (j < a) {
            print("*")
            j += 1
        }
        println("")
        i += 1
    }
}
