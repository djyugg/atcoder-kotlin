fun main(args: Array<String>) {
    val inputCounts = readLine()!!.toInt()

    val inputs = hashSetOf<String>()
    repeat(inputCounts) {
        inputs.add(readLine()!!)
    }

    println(inputs.size)
}
