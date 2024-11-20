package nullvalue

fun main() {

}

fun startsWithA1Elvis(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어왔습니다")
}

fun startsWithA2Elvis(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startsWithA3Elvis(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

// early return
fun calculate(number: Long?): Long {
    return number ?: 0

    // ...
}

fun startsWith(str: String?): Boolean {
    return str!!.startsWith("A")
}
