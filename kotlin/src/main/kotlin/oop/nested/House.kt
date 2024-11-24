package oop.nested

class House(
    private val address: String,
    private val livingRoom: LivingRoom
) {

    inner class LivingRoom(
        private val area: Double,
    ) {
        val address: String
            get() = this@House.address
    }

}
