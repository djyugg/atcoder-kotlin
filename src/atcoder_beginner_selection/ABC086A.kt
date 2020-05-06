fun main(args: Array<String>) {
    fun readLineAndSplitBySpace() = readLine()!!.split(" ")

    val (a, b) = readLineAndSplitBySpace().map { it.toInt() }
    if ((a * b % 2) == 0) println("Even") else println("Odd")
}