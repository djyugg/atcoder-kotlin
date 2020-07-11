fun main(args: Array<String>) {
    val (L, R, d) = readLine()!!.split(" ").map(String::toInt)

    var counter = 0
    for (i in L..R) {
        if (i % d == 0) {
            counter++
        }
    }

    println(counter)
}
