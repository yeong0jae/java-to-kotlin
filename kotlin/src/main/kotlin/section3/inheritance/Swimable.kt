package section3.inheritance

interface Swimable {

    val swimAbility: Int // getter를 하위에서 구현해주는 것을 기대함.

    fun act() {
        println("어푸 어푸")
    }

}
