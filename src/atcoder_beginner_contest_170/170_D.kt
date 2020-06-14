// WA
fun main(args: Array<String>) {
    val N = readLine()!!.toInt()
    val inputs = readLine()!!.split(" ").map(String::toInt).sorted()

    fun check(i: Int, inputs: List<Int>): Boolean {
        for (j in 0 until i) {
            if ((inputs[i] % inputs[j]) == 0) return false
        }

        return true
    }

    var counter = if (inputs[0] == inputs[1]) 0 else 1

    for (i in 1 until N) {
        if (check(i, inputs)) counter++
    }

    println(counter)
}
