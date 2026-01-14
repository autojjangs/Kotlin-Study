package part5

private val magicNumbers = listOf(7, 13)

fun describe(a: Any?) {
    when (a) {
        null -> println("nothing")
        1,2,3 -> println("small number")
        in magicNumbers -> println("magic numbers")
        in 4 .. 100 -> println("big numbers")
        is String -> println("\"$a\"")
        is Long, is Int -> println("\"$a\"")
        else -> println("no idea")
    }
}

fun main() {
    describe(null)
    describe(1)
    describe(3)
    describe(7)
    describe(9)
    describe("AAA")
    describe(1L)
    describe(-1)
    describe(1.0)
}