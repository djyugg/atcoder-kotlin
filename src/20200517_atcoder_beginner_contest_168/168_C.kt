import kotlin.math.*

fun main(args: Array<String>) {
    val (A, B, H, M) = readLine()!!.split(" ").map { it.toDouble() }

    val longHandAngle: Double = if (M == 0.0) 0.0 else 6 * M
    val shortHandAngle: Double = ((H * 60 + M) / 2)

    val angleMax = max(longHandAngle, shortHandAngle)
    val angleMin = min(longHandAngle, shortHandAngle)

    val tmp = angleMax - angleMin
    val angle = if (tmp > 180) {
        angleMin + 360 - angleMax
    } else {
        tmp
    }

    val result = sqrt(A * A + B * B - (2 * A * B * cos(angle * PI / 180)))
    println(result)
}
