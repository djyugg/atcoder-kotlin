fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    var count: Int = N / 1000

    count += if (N % 1000 == 0) {
        0
    } else {
        1
    }
    println(count * 1000 - N)
}
