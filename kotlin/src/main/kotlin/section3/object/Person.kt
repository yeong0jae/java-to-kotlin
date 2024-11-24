package section3.`object`

fun main() {

    println(Singleton.a)
    Singleton.a += 10
    println(Singleton.a)
    
}

class Person private constructor(
    var name: String,
    var age: Int
) {

    companion object Factory : Log {
        private const val MIN_AGE = 0
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("나는 Person의 동행 객체 입니다.")
        }
    }

}

object Singleton {
    var a: Int = 0
}
