package TrainTo100.TrainTo60

/*
052 맴버 함수(member function)
 */

class Building
{
    var name = "" // 건물명
    var date = "" // 건축일자
    var area = 0 // 면적(m2)
    var superscript = '\u00B2' // 제곱에 대한 유니코드


    fun print() // 맴버함수로 추가가 가능하다
    {
        println("이름: "+ this.name) // this는 생략 가능
        println("건축일자: "+ this.date)
        println("면적: ${this.area} m$superscript")

    }
}