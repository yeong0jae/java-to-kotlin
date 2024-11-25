package fp.extension

class Person(
    private val firstName: String,
    private val lastName: String,
    private val age: Int
)

fun createPerson(firstName: String, lastName: String): Person {
    fun validateName(name: String) {
        if (name.isBlank()) {
            throw IllegalArgumentException("Name is blank")
        }
    }
    validateName(firstName)
    validateName(lastName)

    return Person(firstName, lastName, 0)
}
