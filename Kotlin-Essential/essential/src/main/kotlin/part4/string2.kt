package part4

fun main() {
    val text1 = """ABC\nDEF"""
    println(text1)

    val text2 = """ABC${"\n"}DEF"""
    println(text2)
}