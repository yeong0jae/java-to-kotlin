package section1.nullvalue

fun main() {

    val str: String? = "ABC"
//    println(str.length) 컴파일 에러
    println(str?.length) // safe call

    println(str?.length ?: 0) // elvis operator

}

fun startsWithA1(str: String?): Boolean {
    // String은 null 가능이므로 ?, Boolean은 null 불가능이므로 ? 안붙임
    if (str == null) {
        throw IllegalArgumentException("null이 들어왔습니다")
    }
    return str.startsWith("A")
}

fun startsWithA2(str: String?): Boolean? {
    if (str == null) {
        return null // 이 경우 null 반환 가능 -> Boolean?로 선언
    }
    return str.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
//    str.startsWith("A") -> 바로 하면 컴파일 에러
    // null일 수 있는 변수에서 바로 메서드 콜 불가능
    if (str == null) {
        return false
    }
    return str.startsWith("A")
}
