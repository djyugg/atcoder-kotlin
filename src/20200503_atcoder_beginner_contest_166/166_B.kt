fun main(args: Array<String>) {
    fun readLineAndSplitBySpace() = readLine()!!.split(" ")

    val (N, K) = readLineAndSplitBySpace().map { it.toInt() }

    val sunuke = hashSetOf<String>()
    repeat(K) {
        readLine()!!
        readLineAndSplitBySpace().forEach { sunuke.add(it) }
    }

    println(N - sunuke.size)
}
