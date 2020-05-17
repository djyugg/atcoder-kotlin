fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val text = when (N % 10) {
        2, 4, 5, 7, 9 -> "hon"
        0, 1, 6, 8 -> "pon"
        else -> "bon"
    }
    println(text)
}
