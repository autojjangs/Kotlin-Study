package part5

//fun Any?.print() {
//    print(this)
//}
//
//fun printNumberSign(num: Int) {
//    if (num < 0) {
//        "negative"
//    } else if (num > 0) {
//        "positive"
//    } else {
//        "zero"
//    }.print()
//}
//
//fun main(args: Array<String>) {
//    printNumberSign(-2)
//    print(",")
//    printNumberSign(0)
//    print(",")
//    printNumberSign(2)
//}

// 위와 같이 조건이 여러 개일 때, if-else-if 문을 사용하게 되면, 의도에 맞지 않게 코드를 짤 수 있으니 주의
// 조건이 여러 개인 경우, 아래처럼 when 을 사용하는 것이 권장됨.

fun Any?.print() {
    print(this)
}

fun printNumberSign(num: Int) {
    when {
        num < 0 -> "negative number"
        num > 0 -> "positive number"
        else -> "zero"
    }.print()
}

fun main() {
    printNumberSign(-2)
    print(",")
    printNumberSign(0)
    print(",")
    printNumberSign(2)
}
