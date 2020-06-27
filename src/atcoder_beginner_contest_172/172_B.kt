fun main(args: Array<String>) {
    val S = readLine()!!
    val T = readLine()!!
    var counter =0
    S.forEachIndexed { index, c ->
        if(c != T[index]) counter++
    }
    println(counter)
}
