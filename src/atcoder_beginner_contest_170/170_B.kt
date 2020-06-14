fun main(args: Array<String>) {
    val (X, Y) = readLine()!!.split(" ").map(String::toInt)

    for (tsuruCount in 0..X) {
        val kameCount = X - tsuruCount
        val tsuruLegCount = 2 * tsuruCount
        val kameLegCount = 4 * kameCount

        if ((tsuruLegCount + kameLegCount) == Y) {
            println("Yes")
            return
        }
    }

    println("No")
}
