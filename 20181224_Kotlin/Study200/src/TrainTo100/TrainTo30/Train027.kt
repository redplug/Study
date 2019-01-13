package TrainTo100.TrainTo30

fun main(args: Array<String>): Unit
{
    var i = 0
    while (i < 10)
    {
        i += 1
        if(i % 2 == 0)
            continue
        print(i) // 줄바꿈 하지 않음 println줄바꿈
    }
}