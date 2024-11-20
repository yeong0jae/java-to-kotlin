package section2.iteration

fun main() {
}

fun listIteration() {
    val numbers = listOf(1, 2, 3)
    for (number in numbers) {
        println(number)
    }
}

fun basicFor() {
    for (i in 1..10) {
        println(i)
    }
}

fun basicForWithDown() {
    for (i in 10 downTo 1) {
        println(i)
    }
}

fun basicForWithStep() {
    for (i in 1..10 step 2) {
        println(i)
    }
}
