package scope


fun main() {

}

fun printPerson(person: Person?) {
    if (person != null) {
        println(person.name)
        println(person.age)
    }

    person?.let {
        println(person.name)
        println(person.age)
    }
}

fun scope(person: Person) {

    val value1 = person.let {
        it.age
    }

    val value2 = person.run {
        this.age
    }

    val value3 = person.also {
        it.age
    }

    val value4 = person.apply {
        this.age
    }

    with(person) {
        println(name)
        println(this.age)
    }
}

fun letEx() {
    val strings = listOf("Apple", "Banana", "Cherry")
    strings.map { it.length }
        .filter { it > 5 }
        .let(::println)

    val str = "Hello"
    val length = str?.let {
        println(it.uppercase())
        it.length
    }
}

fun createPerson(
    name: String,
    age: Int,
    hobby: String
): Person {
    return Person(
        name = name,
        age = age,
    ).apply {
        this.hobby = hobby
    }
}

fun alsoEx() {
    mutableListOf("Apple", "Banana", "Cherry")
        .also { println("추가 이전 값 : $it") }
        .add("Donut")
}
