fun main(args: Array<String>) {
    fun readLineAndSplitBySpace() = readLine()!!.split(" ")

    val a = readLine()!!.toInt()
    val (b, c) = readLineAndSplitBySpace().map { it.toInt() }
    val s = readLine()!!

    println("${a + b + c} $s")
}