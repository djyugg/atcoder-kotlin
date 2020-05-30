fun main(args: Array<String>) {
    val (H1, M1, H2, M2, K) = readLine()!!.split(" ").map(String::toInt)

    val time1 = H1 * 60 + M1
    val time2 = H2 * 60 + M2
    val time = time2 - time1
    val studyCount = time / K

    println((studyCount - 1) * K + (time % K))
}
