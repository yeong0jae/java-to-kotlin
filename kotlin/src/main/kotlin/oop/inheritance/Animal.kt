package oop.inheritance

abstract class Animal(
    protected val species: String,
    protected open val legCount: Int
) {

    open fun move() {
        println("zz")
    }

}
