import kotlin.math.max
import kotlin.math.min

/**
 * ユークリッドの互除法
 */
fun main(args: Array<String>) {
    val input = readLine()!!.toLong()

    var result = 0L
    for (a in 1..input) {
        for (b in 1..input) {
            for (c in 1..input) {
                result += gcd(a, b, c)
            }
        }
    }
    println(result)
}

fun gcd(a: Long, b: Long, c: Long): Long {
    val internalGcdResult = gcd(max(a, b), min(a, b))
    return gcd(max(internalGcdResult, c), min(internalGcdResult, c))
}

fun gcd(higher: Long, lower: Long): Long {
    if (lower == 0L) {
        return higher
    }

    return gcd(lower, higher % lower)
}