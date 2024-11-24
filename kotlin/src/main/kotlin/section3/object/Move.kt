package section3.`object`

fun main() {
    moveSomething(object : Movable {
        override fun move() {
            println("물체를 이동합니다.")
        }

        override fun fly() {
            println("물체를 날립니다.")
        }
    })
}

private fun moveSomething(movable: Movable) {
    movable.move()
    movable.fly()
}
