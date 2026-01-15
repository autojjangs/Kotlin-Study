package part6

fun addOneAndPrint(list: MutableList<Int> = mutableListOf()) {
    list.add(1)
    println(list)
}

fun main() {
    addOneAndPrint()
    addOneAndPrint()
    addOneAndPrint()
}