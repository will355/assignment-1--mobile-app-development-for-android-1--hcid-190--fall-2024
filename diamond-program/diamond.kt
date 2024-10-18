fun diamond() {
    println("Enter the size of the diamond:")
    val size = readLine()!!.toInt()

    if (size % 2 != 0) {

        for (i in 0 until size) {
            val stars = if (i <= size / 2) 2 * i + 1 else 2 * (size - i - 1) + 1
            val spaces = (size - stars) / 2
            println(" ".repeat(spaces) + "*".repeat(stars))
        }
    } else {

        for (i in 0 until size) {
            val stars = if (i < size / 2) 2 * i + 1 else 2 * (size - i - 1) + 1
            val spaces = (size - stars) / 2
            println(" ".repeat(spaces) + "*".repeat(stars))
        }
    }
}
