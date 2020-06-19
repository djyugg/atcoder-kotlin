fun main(args: Array<String>) {
    val (N, A, B) = readLine()!!.split(" ").map(String::toLong)

    val sum = A + B
    val count = N / sum
    val surplus = N % sum

    val tmp = if (surplus > A) A else surplus

    println(count * A + tmp)
}
