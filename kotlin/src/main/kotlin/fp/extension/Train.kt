package fp.extension

open class Train(
    val name: String = "Train",
    val price: Int = 5_000
)

fun Train.isExpensive(): Boolean {
    println("train의 확장 함수")
    return price > 10_000
}

class Srt : Train("SRT", 40_000)

fun Srt.isExpensive(): Boolean {
    println("SRT의 확장 함수")
    return price > 10_000
}

fun main() {

    val train: Train = Train()
    train.isExpensive() // Train의 확장 함수

    val srt1: Train = Srt()
    srt1.isExpensive() // Train의 확장 함수

    val srt2: Srt = Srt()
    srt2.isExpensive()  // SRT의 확장 함수

}
