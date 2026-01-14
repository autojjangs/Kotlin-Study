package part5

fun main() {
    val superuser = true
    val hasAccess: Boolean = if (superuser) {
        println("Good morning")
        true
    } else {
        false
    }

    println(hasAccess)
}