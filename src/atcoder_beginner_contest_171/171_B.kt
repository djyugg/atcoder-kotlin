fun main(args: Array<String>) {
    val (N, K) = readLine()!!.split(" ").map(String::toInt)
    val priceList = readLine()!!.split(" ").map(String::toInt).sorted()

    println(priceList.subList(0, K).sum())
}
