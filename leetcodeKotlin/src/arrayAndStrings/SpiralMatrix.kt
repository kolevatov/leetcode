package PlusOneSolution

class SpiralMatrix {

    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        // matrix size
        val rows = matrix.size
        val columns = matrix[0].size

        // matrix current borders
        var up = 0
        var down = rows - 1
        var left = 0
        var right = columns - 1

        val result = mutableListOf<Int>()

        while (result.size < rows * columns) {
            println("up=$up, down=$down, left=$left, right=$right")

            if (up != down && left != right) {
                // top row
                for (col in left..right) {
                    result.add(matrix[up][col])
                }
                up++

                for (row in up..down){
                    result.add(matrix[row][right])
                }
                right--

                for (col in right downTo left) {
                    result.add(matrix[down][col])
                }
                down--

                for (row in down downTo up) {
                    result.add(matrix[row][left])
                }
                left++
            } else {
                if (left == right && up != down) {
                    for (row in up..down) {
                        result.add(matrix[row][left])
                    }
                }

                if(up == down && left != right) {
                    for (col in left..right) {
                        result.add(matrix[up][col])
                    }
                }

                if (up==down && left == right) {
                    result.add(matrix[left][up])
                }

            }
        }

        return result
    }
}

fun main() {
    val m = SpiralMatrix()

//    val matrix = arrayOf(
//        intArrayOf(1, 2, 3),
//        intArrayOf(4, 5, 6),
//        intArrayOf(7, 8, 9)
//    )

//    val matrix = arrayOf(
//        intArrayOf(1, 2, 3, 4),
//        intArrayOf(5, 6, 7, 8),
//        intArrayOf(9, 10, 11, 12)
//    )

    val matrix = arrayOf(
        intArrayOf(7),
        intArrayOf(9),
        intArrayOf(6),
    )

    val result = m.spiralOrder(matrix)
    println(result.toString())
}