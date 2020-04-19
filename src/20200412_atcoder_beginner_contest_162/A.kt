fun main(args: Array<String>) {
    val argString = readLine()!!
    if (Regex("7").containsMatchIn(argString)) {
        println("Yes")
    } else {
        println("No")
    }
}
