fun main(args: Array<String>) {
    readLine()!!.split(" ").forEachIndexed { index, value ->
        if (value == "0") {
            println(index + 1)
            return
        }
    }
}
