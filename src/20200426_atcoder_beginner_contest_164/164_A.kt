fun main(args: Array<String>) {
    val input = readLine()!!.split(" ")
    if (input[0].toInt() <= input[1].toInt()) println("unsafe") else println("safe")
}
