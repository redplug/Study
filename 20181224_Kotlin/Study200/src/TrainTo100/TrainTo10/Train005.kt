package TrainTo100.TrainTo10

fun main(args: Array<String>): Unit
{
    val num: Int = 15 - 4 *3
    val num2: Int = 65 % 7
    val num3: Double = 7.5 / 5 + 22.25
    val num4: Double = num / num2 + 0.7
    val num5 = 7.7 % 7
    val num6 = 10 % 7
    val num7:Double = 15.0 // Doubule 타입에 15라고 입력 할경우 오류코드 발생 맞춰서 값을 넣어야 함.

    println(num)
    println(num2)
    println(num3)
    println(num4)
    println(num5)
    println(num6)
    printTypeName(num5)
    printTypeName(num6)
    printTypeName(num7)
}

// kotlin
fun printTypeName(obj : Any){
    if(obj is Int){
        println("Type : Integer")
    } else if(obj is Float){
        println("Type : Float")
    } else if(obj is String){
        println("Type : String")
    } else if(obj is Double){
        println("Type : Double")
    }
}

/*
%연산자는 + - 보다 우선순위가 높음
 */


/* 변수 형 확인하는 방법, 오류가 난다 왜나지?
    if(num6 is Int){
        println("Type : Integer")
    } else if(num6 is Float){
        println("Type : Float")
    } else if(num6 is String){
        println("Type : String")
    } else if(num6 is Double){
        println("Type : Double")
    }
*/