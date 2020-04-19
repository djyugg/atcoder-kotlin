fun main(args: Array<String>) {
    val args = readLine()!!.split(" ")
    val summerVacationDayCount = args[0].toInt()
    val homeworkCount = args[1].toInt()
    val homeworkDayCountList = readLine()!!.split(" ").asSequence().map { it.toInt() }.toList()

    val sumHomeworkDay = (0 until homeworkCount).asSequence().map { homeworkDayCountList[it] }.sum()

    val enjoyDayCount = summerVacationDayCount - sumHomeworkDay
    if (enjoyDayCount >= 0)  println(enjoyDayCount) else println("-1")
}
