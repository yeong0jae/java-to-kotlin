package section1.type

fun main() {
    val person = Person("김영재", 25)
    val log = "이름: ${person.getName()}, 나이: ${person.getAge()}"

    val output = """
        이름 : ${person.getName()}
        나이 : ${person.getAge()}
    """.trimIndent()
    println(output)

    val str = "ABCDE"
    println(str[0]) // 인덱싱 가능
}
