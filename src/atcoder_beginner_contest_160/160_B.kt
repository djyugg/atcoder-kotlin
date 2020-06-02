fun main(args: Array<String>) {
    val X = readLine()!!.toInt()
    val y = X / 500
    val z = (X % 500) / 5

    println(y * 1000 + z * 5)
}
