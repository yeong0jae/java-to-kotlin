package fp.collection

fun main() {

}

fun arrayEx() {

    val array = arrayOf(100, 200)

    array.plus(300) // 새로운 배열을 만들어 반환

    for (i in array.indices) { // 0부터 array.size-1까지 IntRange로 반환
        println("$i 번째 요소: ${array[i]}")
    }

    for ((idx, value) in array.withIndex()) { // python의 enumerate와 비슷
        println("$idx 번째 요소: $value")
    }

}

fun listEx() {

    val numbers = listOf(100, 200)
    val emptyList = emptyList<Int>()

    println(numbers[0])

    for (number in numbers) {
        println(number)
    }

    for ((idx, value) in numbers.withIndex()) {
        println("$idx 번째 요소: $value")
    }

    val mNumbers = mutableListOf(100, 200)
    mNumbers.add(300)

}

fun setEx() {

    val numbers = setOf(100, 200)

    for (number in numbers) {
        println(number)
    }

    for ((idx, value) in numbers.withIndex()) {
        println("$idx $value")
    }

}

fun mapEx() {

    val oldMap = mutableMapOf<Int, String>()
    oldMap.put(1, "Monday")
    oldMap[2] = "Tuesday"

    mapOf(1 to "Monday", 2 to "Tuesday") // 중위 호출

    for (key in oldMap.keys) {
        println("$key ${oldMap[key]}")
    }

    for ((key, value) in oldMap.entries) {
        println("$key $value")
    }
}
