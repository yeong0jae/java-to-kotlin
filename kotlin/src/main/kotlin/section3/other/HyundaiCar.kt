package section3.other

sealed class HyundaiCar(
    val name: String,
    val price: Long
)

class Avante : HyundaiCar("Avante", 1_000L)

class Sonata : HyundaiCar("Sonata", 2_000L)

class Grandeur : HyundaiCar("Grandeur", 3_000L)

private fun handleCar(car: HyundaiCar) {
    when (car) {
        is Avante -> TODO()
        is Sonata -> TODO()
        is Grandeur -> TODO()
    }
}
