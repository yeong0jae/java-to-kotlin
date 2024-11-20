package section2.condition

fun main() {

}

fun validateScoreIsNotNegative(score: Int) {
    if (score < 0) {
        throw IllegalArgumentException("$score 는 0보다 작을 수 없습니다")
    }
}

fun validateScoreIsZeroToHundred(score: Int) {
    if (score !in 0..100) {
        throw IllegalArgumentException("$score 는 0과 100 사이입니다")
    }
}

fun getPassOrFail(score: Int): String {
    return if (score >= 50) { // expression
        "합격"
    } else {
        "불합격"
    }
}

fun getGradeWithSwitch(score: Int): String {
    return when (score / 10) {
        9 -> "A"
        8 -> "B"
        7 -> "C"
        else -> "D"
    }
}

fun getGradeWithIn(score: Int): String {
    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        in 70..79 -> "C"
        else -> "D"
    }
}

fun startsWithA(obj: Any): Boolean {
    return when (obj) {
        is String -> obj.startsWith("A")
        is Int -> obj > 0
        else -> false
    }
}

fun judgeNumber(number: Int) {
    when (number) {
        1, 0, -1 -> println("1, 0, -1 중 하나입니다")
        else -> println("1, 0, -1이 아닙니다")
    }
}

fun judgeNumber2(number: Int) {
    when {
        number == 0 -> println("0입니다")
        number % 2 == 0 -> println("짝수입니다")
        else -> println("홀수입니다")
    }
}
