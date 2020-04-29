fun main(args: Array<String>) {
    val argArray = readLine()!!.split(" ")
    val N = argArray[0].toInt()
    val Y = argArray[1].toInt()

    for (x in 0..N) {
        for (y in 0..(N - x)) {
            val xTotal = x * 10000
            val yTotal = y * 5000
            val z = N - x - y
            val zTotal = z * 1000
            if ((xTotal + yTotal + zTotal) == Y) {
                println("$x $y $z")
                return
            }
        }
    }

    println("-1 -1 -1")
}
