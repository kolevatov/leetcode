package arrayAndStrings


fun findDiagonalOrder(mat: Array<IntArray>): IntArray {
    val m = mat.size
    val n = mat[0].size

    val result = IntArray(m*n)

    // текущие строка и столбец
    var row = 0
    var col = 0
    // направление движения по таблице
    var direction = "UP"

    for (i in 0 until n * m) {
//        println("row: $row, col: $col, direction: $direction, value: ${mat[row][col]}")
        result[i] = mat[row][col]

        if (direction == "UP" && (row == 0 || col == n - 1)){
            direction = "DOWN"
//            println("change direction to $direction")

            if (row == 0 && col < n - 1){
                col++
            } else {
                row++
            }
            continue
        }

        if (direction == "DOWN" && (col == 0 || row == m - 1)){
            direction = "UP"
//            println("change direction to $direction")

            if (col == 0 && row < m - 1) {
                row++
            } else {
                col++
            }
            continue
        }

        if (direction == "UP"){
            row--
            col++
        } else {
            row++
            col--
        }
    }

    return result
}

fun main() {
    val matrix = arrayOf(
        intArrayOf(1, 2, 3),
        intArrayOf(4, 5, 6),
        intArrayOf(7, 8, 9)
    )

//    val matrix = arrayOf(
//        intArrayOf(1, 2),
//        intArrayOf(3, 4)
//    )

    val newArray = findDiagonalOrder(matrix)

    println(newArray.contentToString())

//    for (row in matrix) {
//        println(row.contentToString())
//    }
}