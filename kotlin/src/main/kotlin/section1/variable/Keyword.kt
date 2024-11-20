package section1.variable

val PI = 3.141592 // can declare variables at the top level

fun main() {

    var number1 = 10L
    number1 = 5L
    val number2 = 20L
//    number2 = 15L -> 재할당 시 컴파일 에러

    var number3: Long
    var number4 = 30L
//    var number5 = number3 + number4
//    println(number5) -> 초기값 없이 사용 시 컴파일 에러

    val number6: Long
    number6 = 15L // val 최초 한 번만 할당 가능
    println(number6)

    val numbers = listOf(1, 2)
//    numbers = listOf(3, 4) 컴파일 에러

}

fun primitiveType() {

    var number1: Long = 10L // long은 존재하지 않음
}

fun nullType() {

    var number1: Long? = null
//    var number2: Long = null -> null 불가능, 컴파일 에러

}

fun instance() {

    var person = Person("김영재")
}
