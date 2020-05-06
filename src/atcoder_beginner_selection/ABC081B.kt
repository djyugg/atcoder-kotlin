fun main(args: Array<String>) {
    readLine()
    val AArray = readLine()!!.split(" ").map { it.toInt() }.toMutableList()

    var counter = 0
    while (true) {
        for (i in AArray.indices) {
            if (AArray[i] % 2 == 1) {
                println(counter)
                return
            }

            val test = AArray[i] / 2
            AArray[i] = test
        }
        counter++
    }
}
