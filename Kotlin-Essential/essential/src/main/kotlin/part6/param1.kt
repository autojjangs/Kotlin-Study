package part6

fun main() {
    val list = listOf(1,2,3,4)

    println(list.joinToString())
    println(list.joinToString(separator = "="))
    println(list.joinToString(limit = 2))
}