fun main(args: Array<String>) {
    val S = readLine()!!
    var answer = 0
    var counter = 0

    S.forEach {
        if (it == 'R') {
            counter++
            answer = counter
        } else {
            counter = 0
        }
    }

    println(answer)
}
