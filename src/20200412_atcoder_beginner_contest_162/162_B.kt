fun main(args: Array<String>) {
    val arg = readLine()!!.toLong()
    val sum = (1..arg).toList()
        .asSequence()
        .filter { (it % 3L) != 0L }
        .filter { (it % 5L) != 0L }
        .sum()
    println(sum)
}
