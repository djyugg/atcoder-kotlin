import java.math.BigDecimal
import java.math.RoundingMode

fun main(args: Array<String>) {
    val result = readLine()!!.split(" ")
        .map { BigDecimal.valueOf(it.toDouble()) }
        .reduce { acc, bigDecimal -> acc.multiply(bigDecimal) }

    println(result.setScale(0, RoundingMode.DOWN).toPlainString())
}
