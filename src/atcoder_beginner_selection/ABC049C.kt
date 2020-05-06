fun main(args: Array<String>) {
    var S = readLine()!!

    val texts = arrayOf("dreamer", "eraser", "dream", "erase")
    while (true) {
        if(S == "") {
            println("YES")
            return
        }

        val matchText = texts.find { S.endsWith(it) } ?: break
        S = S.substring(0 , S.length - matchText.length)
    }

    println("NO")
}
