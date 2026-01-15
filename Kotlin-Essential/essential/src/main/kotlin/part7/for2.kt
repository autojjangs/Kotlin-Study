package part7

fun main() {
    val names = listOf("Aless", "Mary", "Bob")

    // 아래의 세 가지 방식은 모두 같은 출력값을 냄.

    // 첫 번째 방식
    for (i in names.indices) { // 리스트의 사이즈로 인덱스범위 특정(0 ..< names.size)하지 않음. 인덱스의 범위를 반환하는 indices 프로퍼티를 쓰는 것이 코틀린다운 코드임.
        val name = names[i]
        println("[$i] $name")
    }

    println() // 줄바꿈

    // 두 번째 방식
    for ((index, name) in names.withIndex()) { // withIndex()는 인덱스된 값을 반환함. 인덱스된 값에는 인덱스와 값이 둘 다 포함되어 있음.
        // 그래서 새로운 변수에 인덱스에 맞는 값을 따로 더 할당할 필요가 없어짐. (위와 비교해보기)
        println("[$index] $name")
    }

    println() // 줄바꿈

    // 세 번째 방식
    names.forEachIndexed { index, name -> println("[$index] $name") }
}