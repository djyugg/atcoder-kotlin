fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val counter = IntArray(4)

    repeat(N) {
        val input = readLine()!!

        when(input) {
            "AC" -> counter[0]++
            "WA" -> counter[1]++
            "TLE" -> counter[2]++
            "RE" -> counter[3]++
        }
    }

    println("AC x ${counter[0]}")
    println("WA x ${counter[1]}")
    println("TLE x ${counter[2]}")
    println("RE x ${counter[3]}")
}
