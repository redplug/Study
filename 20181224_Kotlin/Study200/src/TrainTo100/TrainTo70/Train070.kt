package TrainTo100.TrainTo70

/*
070 Any 클래스
 */

class Building(val name: String ="", // 건물명
        val date: String = "", //건축일자
        val area: Int = 0)  // 면적
{
    override fun toString() =
        "이름 : ${this.name}\n" +
                "건축일자 : ${this.date}\n" +
                "면적 : ${this.area} m2"
}

fun main(args: Array<String>) {
    val building = Building("코틀린",area = 100)
    printObject(building)
}

fun printObject(any: Any)
{
    println(any.toString())

}
