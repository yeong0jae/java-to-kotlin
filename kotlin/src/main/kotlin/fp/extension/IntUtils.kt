package fp.extension

fun Int.add(other: Int): Int {
    return this + other
}

infix fun Int.add2(other: Int): Int {
    return this + other
}

inline fun Int.subtract(other: Int): Int {
    return this - other
}

fun main() {
    val a = 10
    val b = 20

    println(a.add(b))
    println(a add2 b) // 중위 함수 호출
    println(a.subtract(b)) // inline 함수 호출
}
