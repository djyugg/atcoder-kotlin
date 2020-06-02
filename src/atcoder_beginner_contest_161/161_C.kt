import java.lang.Long.min
import kotlin.math.abs

fun main(args: Array<String>) {
    val (N, K) = readLine()!!.split(" ").map(String::toLong)

    val remainder = N % K
    println(min(remainder, abs(remainder - K)))
}
