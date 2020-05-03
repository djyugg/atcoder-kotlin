fun main(args: Array<String>) {
    val X = readLine()!!.toLong()

    var yokin: Long = 100
    var counter = 0
    while (true) {
        counter++
        yokin = (yokin * 1.01).toLong()

        if (X <= yokin) {
            break
        }
    }

    println(counter)
}
