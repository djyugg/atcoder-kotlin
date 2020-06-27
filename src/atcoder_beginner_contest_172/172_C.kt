// WA,TLE
fun main(args: Array<String>) {
    val input = readLine()!!.split(" ")
    val N = input[0].toInt()
    val M = input[1].toInt()
    val K = input[2].toLong()
    val aList = readLine()!!.split(" ").map(String::toInt).toMutableList()
    val bList = readLine()!!.split(" ").map(String::toInt).toMutableList()

    var counter = 0
    var totalMinutes = 0L
    val loopCount = N + M
    for (i in 0 until loopCount) {
        val a = if (aList.isNotEmpty()) aList[0] else Int.MAX_VALUE
        val b = if (bList.isNotEmpty()) bList[0] else Int.MAX_VALUE

        totalMinutes += if (a > b) {
            bList.removeAt(0)
        } else {
            aList.removeAt(0)
        }

        if (totalMinutes <= K) {
            counter++
        } else {
            break
        }
    }

    println(counter)
}
