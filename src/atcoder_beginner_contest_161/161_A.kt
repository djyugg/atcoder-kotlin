fun main(args: Array<String>) {
    var (X, Y, Z) = readLine()!!.split(" ").map { it.toInt() }
    X = Y.also { Y = X }
    X = Z.also { Z = X }
    println("$X $Y $Z")
}
