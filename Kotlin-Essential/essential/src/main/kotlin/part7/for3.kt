package part7

fun main() {
    val capitals = mapOf(
        "USA" to "Washington DC",
        "Poland" to "Warsaw",
        "Ukraine" to "Kiev",
    )

    for ((country, capital) in capitals) {
        println("The capital of $country is $capital.")
    }

    println() // 줄바꿈

    capitals.forEach { (country, capital) ->
        println("The capital of $country is $capital.") }
}