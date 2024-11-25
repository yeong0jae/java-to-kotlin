package fp.collection2

fun main() {
    val fruits = listOf(
        Fruit(1, "사과", 1000, 1200),
        Fruit(2, "바나나", 1500, 1600),
        Fruit(3, "키위", 800, 900)
    )

    val fruitsInList: List<List<Fruit>> = listOf(
        listOf(
            Fruit(1, "사과", 1000, 1200),
            Fruit(2, "사과", 1500, 1600),
            Fruit(3, "사과", 800, 900)
        ),
        listOf(
            Fruit(4, "바나나", 1000, 1200),
            Fruit(5, "바나나", 1500, 1600),
            Fruit(6, "바나나", 800, 900)
        ),
        listOf(
            Fruit(7, "키위", 1000, 1200),
        )
    )

    // filter
    val apples = fruits.filter { fruit -> fruit.name == "사과" }

    val applesIndexed = fruits.filterIndexed { idx, fruit ->
        println(idx)
        fruit.name == "사과"
    }

    // map
    val applePrices = fruits.filter { fruit -> fruit.name == "사과" }
        .map { fruit -> fruit.currentPrice }

    val applePricesIndexed = fruits.filter { fruit -> fruit.name == "사과" }
        .mapIndexed { idx, fruit ->
            println(idx)
            fruit.currentPrice
        }

    val values = fruits.filter { fruit -> fruit.name == "사과" }
//        .mapNotNull { fruit -> fruit.nullOrValue() }

    // all
    val isAllApples = fruits.all { fruit -> fruit.name == "사과" }

    // none
    val isNoneApples = fruits.none { fruit -> fruit.name == "사과" }

    // any
    val isAnyApples = fruits.any { fruit -> fruit.name == "사과" }

    // count
    val countApples = fruits.count { fruit -> fruit.name == "사과" }
    val countAllApples = fruits.count()

    // sortedBy
    val sortedFruits = fruits.sortedBy { fruit -> fruit.currentPrice }

    // distinctBy
    val distinctFruits = fruits.distinctBy { fruit -> fruit.name }
        .map { fruit -> fruit.name } // 중복 제거 후 이름만 추출

    // first (무조건 null이 아니어야함)
    fruits.first()
    // firstOrNull
    fruits.firstOrNull()

    // last
    fruits.last()
    // lastOrNull
    fruits.lastOrNull()

    // groupBy (name to List<Fruit>)
    val map: Map<String, List<Fruit>> = fruits.groupBy { fruit -> fruit.name } // 이름으로 그룹화

    // associateBy (id to Fruit)
    val map2: Map<Long, Fruit> = fruits.associateBy { fruit -> fruit.id } // id로 맵핑

    // groupBy2 (name to List<currentPrice>)
    val map3: Map<String, List<Long>> = fruits
        .groupBy({ fruit -> fruit.name }, { fruit -> fruit.currentPrice })

    // associateBy2 (id to currentPrice)
    val map4: Map<Long, Long> = fruits
        .associateBy({ fruit -> fruit.id }, { fruit -> fruit.currentPrice })
    // 두 개 이상의 함수를 받을 때는 후행람다 사용 x

    // map filter
    val map5: Map<String, List<Fruit>> = fruits.groupBy { fruit -> fruit.name }
        .filter { (key, value) -> key == "사과" }
    // map에 대해서도 filter, any, none 등 사용 가능


    // 중첩 컬렉션 처리
    val samePriceFruits = fruitsInList.flatMap { list ->
        list.filter { fruit -> fruit.factoryPrice == fruit.currentPrice }
    }
    // refactor : 하나의 람다만 쓰는 것처럼 변경
    val samePriceFruits2 = fruitsInList.flatMap { list -> list.samePriceFilter }

    // flatten
    val flattenFruits = fruitsInList.flatten()

}

val List<Fruit>.samePriceFilter: List<Fruit>
    get() = this.filter(Fruit::isSamePrice)

data class Fruit(
    val id: Long,
    val name: String,
    val factoryPrice: Long,
    val currentPrice: Long
) {

    val isSamePrice: Boolean
        get() = factoryPrice == currentPrice
}
