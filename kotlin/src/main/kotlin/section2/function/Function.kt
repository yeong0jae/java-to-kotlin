package section2.function

fun main() {
    repeat("Hello", 5)
    repeat("World", useNewLine = false) // named argument

    printNameAndGender("남성", "김영재")
    printNameAndGender(
        gender = "남성",
        name = "김영재"
    ) // named argument

    // 가변인자
    printAll("A", "B", "C") // 콤마로
    val array = arrayOf("A", "B", "C")
    printAll(*array) // spread operator. 배열을 풀어서 전달
    printAll(*array, "D", "E")
}

fun max(a: Int, b: Int) =
    if (a > b) a else b

fun repeat(
    str: String,
    num: Int = 3,
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        print(str)
        if (useNewLine) {
            println()
        }
    }
}

fun printNameAndGender(name: String, gender: String) { // 동일한 타입이 연속으로 존재
    println(name)
    println(gender)
}

fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}
