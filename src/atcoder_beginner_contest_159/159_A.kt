fun main(args: Array<String>) {
    val (N, M) = readLine()!!.split(" ").map(String::toInt)

    println(N * (N - 1) / 2 + M * (M - 1) / 2)
}
