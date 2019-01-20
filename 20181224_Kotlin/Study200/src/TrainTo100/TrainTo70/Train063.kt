package TrainTo100.TrainTo70

/*
063 맴버 함수의 중위 표기법(Infix Notation)
중위 표기법을 지원하려면 맴버 함수 선언문 앞에 infix를 붙여야 한다.
 */

class Point(var x: Int = 0, var y: Int = 0)
{
    //base를 원점으로 생각했을 때의 좌표를 반환한ㄷ.
    infix fun from(base: Point): Point{
        return Point(x - base.x, y - base.y)

    }
}

fun main(args: Array<String>) {
    val pt = Point(3,6) from Point(1,1)
    println(pt.x)
    println(pt.y)

}