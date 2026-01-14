package part5

fun secondToPrettyTime(second: Long): String {
    var x = second / 3600
    var y = (second % 3600) / 60
    var z = second % 60

    var name: String = when {
        (second < 0) -> "Invalid input"
        (second > 0) -> "$x h $y m $z s"
        else -> ""
    }
    return name
}

fun main() {
    println(secondToPrettyTime(-1))
    println(secondToPrettyTime(150))
    println(secondToPrettyTime(3600))
    println(secondToPrettyTime(1410))
    println(secondToPrettyTime(3665))

}