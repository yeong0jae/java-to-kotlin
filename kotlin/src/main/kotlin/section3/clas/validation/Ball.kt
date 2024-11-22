package section3.clas.validation

class Ball(
    number: Int
) {
    private val number: Int

    init {
        require(number in 1..45) { "number는 1~45 사이여야 합니다." }
        this.number = number
    }

}
