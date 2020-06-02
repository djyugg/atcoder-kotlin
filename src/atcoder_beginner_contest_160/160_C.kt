fun main(args: Array<String>) {
    val (K, N) = readLine()!!.split(" ").map(String::toInt)
    val houseList = readLine()!!.split(" ").map(String::toInt).toMutableList()

    houseList.add(houseList.first() + K)
    var max = 0
    for (i in 0 until (houseList.size - 1)) {
        max = max.coerceAtLeast(houseList[i + 1] - houseList[i])
    }

    println(K - max)
}
