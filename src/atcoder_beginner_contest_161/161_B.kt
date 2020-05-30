fun main(args: Array<String>) {
    val (_, M) = readLine()!!.split(" ").map(String::toInt)
    val input = readLine()!!.split(" ").map(String::toDouble)

    val judge = input.sum() / (4.0 * M)
    val count = input.count { it >= judge }
    if (count >= M) println("Yes") else println("No")
}
