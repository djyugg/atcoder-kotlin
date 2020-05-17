fun main(args: Array<String>) {
    val (A, B, C, K) = readLine()!!.split(" ").map { it.toInt() }

    if (A > K) {
        println(K)
        return
    }

    val point = A
    var cardCount = K - A
    if (B > cardCount) {
        println(point)
        return
    }

    cardCount -= B
    if (C > cardCount) {
        println(point - cardCount)
    } else {
        println(point - C)
    }
}
