package fp.lambda

fun main() {
    val fruits = listOf(
        Fruit("사과", 1000),
        Fruit("사과", 1200),
        Fruit("사과", 1200),
        Fruit("사과", 1500),
        Fruit("바나나", 3000),
        Fruit("바나나", 3200),
        Fruit("바나나", 2500),
        Fruit("수박", 10000)
    )

    // 익명 함수
    val isApple = fun(fruit: Fruit): Boolean {
        return fruit.name == "사과"
    }
    val isApple2 = { fruit: Fruit -> fruit.name == "사과" }
    val isApple3 = { fruit: Fruit ->
        println("사과를 찾습니다")
        fruit.name == "사과" // return 생략 가능
    }

    // 익명 함수 호출
    isApple(fruits[0])
    isApple.invoke(fruits[0])

    // 익명 함수 전달
    val apples = filterFruit(fruits, isApple)
    filterFruit(fruits) { fruit -> fruit.name == "사과" }

    // Closure
    var targetFruitName = "바나나"
    targetFruitName = "사과"
    filterFruit(fruits) { it.name == targetFruitName }
}

private fun filterFruit(
    fruits: List<Fruit>, filter: (Fruit) -> Boolean
): List<Fruit> {
    val results = mutableListOf<Fruit>();
    for (fruit in fruits) {
        if (filter(fruit)) { // filter.invoke(fruit) 도 가능
            results.add(fruit)
        }
    }
    return results
}

