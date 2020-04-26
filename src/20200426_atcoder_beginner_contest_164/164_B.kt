fun main(args: Array<String>) {
    val args = readLine()!!.split(" ")
    val takahashiMonsterHitPoint = args[0].toInt()
    val takahashiMonsterPower = args[1].toInt()
    val aokiMonsterHitPoint = args[2].toInt()
    val aokiMonsterPower = args[3].toInt()

    val aokiAttackTimes = computeAttackTimes(takahashiMonsterHitPoint, aokiMonsterPower)
    val takahashiAttackTimes = computeAttackTimes(aokiMonsterHitPoint, takahashiMonsterPower)

    if (takahashiAttackTimes <= aokiAttackTimes) println("Yes") else println("No")
}

fun computeAttackTimes(hitPoint: Int, power: Int): Int {
    var attackTimes = hitPoint / power
    if ((hitPoint % power) > 0) {
        attackTimes++
    }

    return attackTimes
}