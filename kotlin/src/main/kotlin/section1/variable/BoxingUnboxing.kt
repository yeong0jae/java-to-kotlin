package section1.variable

fun main() {
    val t = System.currentTimeMillis()
    var sum: Long = 0L
    for (i in 0L..1_000_000L) {
        sum += i
    }
    println("실행 시간: ${System.currentTimeMillis() - t} ms")
}
