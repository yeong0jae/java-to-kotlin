package section1.nullvalue

fun main() {
    val person = Person("김영재")
    startWithA(person.name)
    // getName이 @Nullable이면 컴파일 에러
    // @NotNull이라면 컴파일 에러가 발생하지 않음
    // 아무 정보가 없다면, 런타임 에러가 발생할 수 있음
}

fun startWithA(str: String?): Boolean { // null이 들어올 수 없다
    return str?.startsWith("A") ?: false
}
