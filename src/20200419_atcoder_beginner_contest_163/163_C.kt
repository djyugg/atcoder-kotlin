fun main(args: Array<String>) {
    val input = readLine()!!.toInt()
    val counter = IntArray(input)

    readLine()!!.split(" ")
        .asSequence()
        .forEach { counter[it.toInt()-1]++ }

    counter.forEach { println(it) }
}
