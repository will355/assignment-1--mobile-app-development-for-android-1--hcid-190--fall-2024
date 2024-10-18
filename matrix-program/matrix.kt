fun matrix() {
    println("Enter the size of the matrix:")
    val n = readLine()!!.toInt()


    val matrix = Array(n) { IntArray(n) }
    var value = 1
    for (i in 0 until n) {
        for (j in 0 until n) {
            matrix[i][j] = value++
        }
    }


    println("Original matrix:")
    printMatrix(matrix)


    for (i in 0 until n) {
        for (j in 0 until n - i - 1) {
            val temp = matrix[i][j]
            matrix[i][j] = matrix[n - j - 1][n - i - 1]
            matrix[n - j - 1][n - i - 1] = temp
        }
    }


    println("Modified matrix with diagonal untouched:")
    printMatrix(matrix)
}


fun printMatrix(matrix: Array<IntArray>) {
    for (row in matrix) {
        println(row.joinToString(" "))
    }
}
