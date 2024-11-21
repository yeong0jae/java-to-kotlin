package section3.clas

fun main() {
    val person = Person("김영재", 25)
    println(person.name)
    person.age = 26

    val person3 = Person()
}

class Person(
    name: String = "이름 없음",
    var age: Int = 1
) {

    var name = name
        get() = field.uppercase() // backing field
        set(value) {
            field = value.uppercase()
        }

    val uppercaseName
        get() = this.name.uppercase()
    
    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 $age 일 수 없습니다.")
        }
        println("init 블록")
    }

    val isAdult: Boolean
        get() = this.age >= 20
}
