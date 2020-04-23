fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val s = readLine()!!

    var rCount = 0L
    var gCount = 0L
    var bCount = 0L

    s.forEach {
        when (it) {
            'R' -> rCount++
            'G' -> gCount++
            'B' -> bCount++
        }
    }

    var patternCount = rCount * gCount * bCount

    for (i in 0 until (n - 2)) {
        for (j in ((i + 1) until (n - 1))) {
            val k = (2 * j) - i
            if (k >= n) continue

            if (s[i] == s[j]) continue
            if (s[i] == s[k]) continue
            if (s[j] == s[k]) continue
            patternCount--
        }
    }

    println(patternCount)
}
