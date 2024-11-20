package type

fun main() {
    val number1 = 3
    val number2: Long = number1.toLong() // 명시적 형변환

    val number3: Int? = 3
    val number4: Long = number3?.toLong() ?: 0L // null 처리

    printAgeIfPersonNull(null)
    printAgeIfPersonNull(Person("김영재", 25))

    val str: String = "ABCDE"
    val ch = str[0]
}

fun printAgeIfPerson(obj: Any) {
    if (obj is Person) {
        val person = obj as Person // as Person 생략 가능 : 스마트 캐스트
        println(person.getAge())
    }
}

fun printAgeIfPersonNull(obj: Any?) {
//    val person = obj as Person NPE 발생
    val person = obj as? Person // as? Person : elvis 같이 obj가 null이 아니면 캐스팅, null이면 null 반환
    // as?라면 person은 Person? 타입이 된다.
    // as라면 person은 Person 타입이 된다.
    println(person?.getAge())
}
