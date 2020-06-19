fun main(args: Array<String>) {
    val S = readLine()!!

    val tmp = S[0]

    for (i in 1 until S.length) {
        if (tmp != S[i]) {
            println("Yes")
            return
        }
    }

    println("No")
}
