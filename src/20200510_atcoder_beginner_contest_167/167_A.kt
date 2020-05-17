fun main(args: Array<String>) {
    val S = readLine()!!
    val T = readLine()!!

    if (T.substring(0, S.length) != S) {
        println("No")
        return
    }

    if ((S.length + 1) == T.length) println("Yes") else println("No")
}
