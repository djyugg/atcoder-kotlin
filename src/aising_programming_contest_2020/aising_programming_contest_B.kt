fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val aList = readLine()!!.split(" ").map(String::toInt)

    var counter = 0
    aList.forEachIndexed { index, i ->
        if ((index + 1) % 2 == 1) {
            if (i % 2 == 1) {
                counter++
            }
        }
    }

    println(counter)
}
