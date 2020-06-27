fun main(args: Array<String>) {
    val N = readLine()!!.toInt()

    var total = 0L

    fun f(n: Int): Int {
        if (n == 1) return 1

        var compute = n
        val counter = hashMapOf<Int, Int>()
        for (i in 2..n) {
            while (compute % i == 0) {
                if (counter.contains(i)) {
                    counter[i] = counter[i]!! + 1
                } else {
                    counter[i] = 1
                }

                compute /= i
            }
        }

        return counter.keys.map { counter[it]!! + 1 }.reduce { acc, i -> acc * i }
    }

    for (i in 1 .. N) {
        total += i * f(i)
    }

    println(total)
}
