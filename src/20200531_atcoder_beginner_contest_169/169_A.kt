fun main(args: Array<String>) {
    println(readLine()!!.split(" ").map(String::toInt).reduce { a, b -> a * b })
}
