package section3.inheritance

class Penguin(
    species: String
) : Animal(species, 2), Swimable, Flyable {

    private val wingCount = 2

    override fun move() {
        println("펭귄이 움직입니다~ 꿱꿱")
    }

    override val legCount
        get() = super.legCount + this.wingCount

    override fun act() {
        super<Swimable>.act()
        super<Flyable>.act()
    }

    override val swimAbility: Int // 프로퍼티 구현
        get() = 3

}
