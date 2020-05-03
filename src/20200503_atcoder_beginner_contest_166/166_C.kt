import kotlin.math.max

fun main(args: Array<String>) {
    fun readLineAndSplitBySpace() = readLine()!!.split(" ")

    val (N, M) = readLineAndSplitBySpace().map { it.toInt() }
    val hArray = readLineAndSplitBySpace().map { it.toInt() }

    val nearHigherArray = IntArray(N) { 0 }
    repeat(M) {
        val (a, b) = readLineAndSplitBySpace().map { it.toInt() }
        val aIndex = a - 1
        val bIndex = b - 1

        nearHigherArray[aIndex] = max(nearHigherArray[aIndex], hArray[bIndex])
        nearHigherArray[bIndex] = max(nearHigherArray[bIndex], hArray[aIndex])
    }

    var counter = 0
    hArray.forEachIndexed { index, high ->
        if (high > nearHigherArray[index]) counter++
    }

    println(counter)
}
