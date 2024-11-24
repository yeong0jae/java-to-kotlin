package oop.inheritance

fun main() {
    Derived(200)
}

open class Base(
    open val number: Int = 100
) {
    init {
        println("Base Class")
        println(number)
    }
}

class Derived(
    override val number: Int
) : Base(number) {
    init {
        println("Derived Class")
    }
}
