package other

class Person(
    val name: String,
    val age: Int
) {

    operator fun component1(): String {
        return name
    }

    operator fun component2(): Int {
        return age
    }
}

fun main() {

    val person = Person("김영재", 25)
    val (name, age) = person
//    val name = person.component1()
//    val age = person.component2()

    println("이름: $name, 나이: $age")

    val numbers = listOf(1, 2, 3, 4, 5)
    numbers.map { number -> number + 1 }
        .forEach { number -> println(number) } // break, continue 사용 불가능

    loop@ for (i in 1..10) {
        for (j in 1..10) {
            if (i == 1 && j == 2) {
                break@loop
            }
            println("i: $i, j: $j")
        }
    }
}
