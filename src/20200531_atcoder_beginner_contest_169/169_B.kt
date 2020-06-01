fun main(args: Array<String>) {
    readLine()
    val input = readLine()!!.split(" ").map(String::toLong)

    input.forEach {
        // 0が含まれていたら結果は必ず0になる
        if (it == 0L) {
            println(0)
            return
        }
    }

    var prod = 1L
    input.forEach {
        // This condition is equivalent to prod*a[i] <= 10ˆ18
        if (it <= 1000000000000000000L / prod) {
            prod *= it
        } else {
            println(-1)
            return
        }
    }

    println(prod)
}
