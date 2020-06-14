fun main(args: Array<String>) {
    val (X, N) = readLine()!!.split(" ").map(String::toInt)
    val inputs = if (N == 0) IntArray(0) else readLine()!!.split(" ").map(String::toInt).toIntArray()

    fun solve(target: Int, inputs: IntArray, diff: Int): Int {
        val under = target - diff
        if (!inputs.contains(under)) {
            return under
        }

        val over = target + diff
        if (!inputs.contains(over)) {
            return over
        }

        return solve(target, inputs, diff + 1)
    }

    println(solve(X, inputs, 0))
}
