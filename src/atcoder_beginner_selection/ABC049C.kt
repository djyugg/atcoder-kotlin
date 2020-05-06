fun main(args: Array<String>) {
    var S = readLine()!!

    val dream = "dream"
    val dreamer = "dreamer"
    val erase = "erase"
    val eraser = "eraser"

    while (true) {
        if (S == "") {
            println("YES")
            return
        }

        S = if (S.startsWith(dream)) {
            if (S.startsWith(dreamer) && !S.substring(dream.length).startsWith(erase)) {
                S.substring(dreamer.length)
            } else {
                S.substring(dream.length)
            }
        } else if (S.startsWith(erase)) {
            if (S.startsWith(eraser) && !S.substring(erase.length).startsWith(dream)) {
                S.substring(eraser.length)
            } else {
                S.substring(erase.length)
            }
        } else {
            break
        }
    }

    println("NO")
}
