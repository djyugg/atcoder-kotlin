fun main(args: Array<String>) {
    fun readLineAndSplitBySpace() = readLine()!!.split(" ")

    val (N, M, Q) = readLineAndSplitBySpace().map { it.toInt() }

    val a = IntArray(Q)
    val b = IntArray(Q)
    val c = IntArray(Q)
    val d = IntArray(Q)

    for (i in 0 until Q) {
        val array = readLineAndSplitBySpace()
        a[i] = array[0].toInt() - 1
        b[i] = array[1].toInt() - 1
        c[i] = array[2].toInt()
        d[i] = array[3].toInt()
    }

    val A = IntArray(N)

    fun compute(index: Int, start: Int) :Int {
        if (index == N) {
            var sum = 0
            for (j in 0 until Q) {
                if ((A[b[j]] - A[a[j]]) == c[j]) sum += d[j]
            }

            return sum
        }

        var max = 0
        for (i in start..M) {
            A[index] = i
            max = max.coerceAtLeast(compute(index + 1, A[index]))
        }

        return max
    }

    println(compute(0, 1))
}
