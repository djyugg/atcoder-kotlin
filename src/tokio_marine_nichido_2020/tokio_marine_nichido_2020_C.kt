// TLE
fun main(args: Array<String>) {
    val (N, K) = readLine()!!.split(" ").map(String::toInt)
    val lampList = readLine()!!.split(" ").map(String::toInt).toIntArray()
    val tempList = IntArray(N)

    repeat(K) {
        for (i in tempList.indices) tempList[i] = 0

        lampList.forEachIndexed { currentIndex, value ->
            val tempMin = kotlin.math.ceil(currentIndex - value - 0.5).toInt()
            val min = if (tempMin < 0) 0 else tempMin

            val tempMax = kotlin.math.floor(currentIndex + value + 0.5).toInt()
            val max = if (tempMax < N) tempMax else (N - 1)

            for (index in min..max) tempList[index]++
        }
        for (i in tempList.indices) lampList[i] = tempList[i]
    }

    println(lampList.joinToString(separator = " "))
}
