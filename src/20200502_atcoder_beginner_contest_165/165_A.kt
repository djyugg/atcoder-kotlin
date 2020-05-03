fun main(args: Array<String>) {
    val K = readLine()!!.toInt()
    val inputArray = readLine()!!.split(" ")
    val A = inputArray[0].toInt()
    val B = inputArray[1].toInt()

    for (i in A..B) {
        if (i % K == 0) {
            println("OK")
            return
        }
    }
    println("NG")
}
