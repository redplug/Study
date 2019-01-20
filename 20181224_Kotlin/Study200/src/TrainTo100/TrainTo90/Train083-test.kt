package TrainTo100.TrainTo90

import TrainTo100.TrainTo40.getAverage

private var num = 10 // Train083-test.kt 파일 내에서만 접근 가능

private fun print() // Train083-test.kt 파일 내에서만 접근 가능
    = println(num)

public fun hello(value: Int) // 어디서나 접근 가능
{
    num = value
    print()
}

public class Person(age: Int) // 어디에서나 접근 가능
{
    // 디폴트 Setter를 private으로 지정. Setter는 Person 클래스 내부에서만 접근 가능
    public var age = age
        private set
    // Getter를 public로 지정. Getter는 어딘에서나 접근 가능
    public val isYoung public get() = age < 30
}