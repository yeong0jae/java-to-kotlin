package operator

fun main() {
    val money1 = JavaMoney(2_000L)
    val money2 = money1
    val money3 = JavaMoney(2_000L)

    println(money1 == money2) // true
    println(money1 == money3) // true
    println(money1 === money3) // false

    if (money1 > money3) {
        println("money1 is greater than money2")
    }

    val moneyK1 = Money(1_000L)
    val moneyK2 = Money(2_000L)
    println(moneyK1 + moneyK2)
}
