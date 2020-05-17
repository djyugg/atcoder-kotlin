fun main(args: Array<String>) {
    val K = readLine()!!.toInt()
    val S = readLine()!!

    if(S.length > K) {
        println("${S.substring(0, K)}...")
    } else {
        println(S)
    }
}
