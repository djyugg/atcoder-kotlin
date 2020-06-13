fun main(args: Array<String>) {
    val (A, V) = readLine()!!.split(" ").map(String::toInt)
    val (B, W) = readLine()!!.split(" ").map(String::toInt)
    val T = readLine()!!.toInt()

    val distance = kotlin.math.abs(A - B)
    val move = V - W

    if(move < 1) {
        println("NO")
        return
    }

    val times = (distance / move) + (if (distance % move == 0) 0 else 1)

    println(if (T < times) "NO" else "YES")
}
