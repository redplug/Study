package programmers

fun main(args: Array<String>) {
        class Solutionnumbersum {
                fun Solutionnumbersum(n: Int): Int {
                        var answer = 0
                        var text: String = n.toString()
                        var i: Int = 0
                        while(i < text.length) {
                                answer = answer + text.substring(i,i+1).toInt()
                                i +=1
                        }
                        return answer
                }
        }


}

