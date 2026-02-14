package arrayAndStrings

/*
Given an integer rowIndex, return the rowIndex (0-indexed) row of the Pascal's triangle.
 */
class PascalTriangle2Solution {
    fun getRow(rowIndex: Int): List<Int> {
        var firstRow = mutableListOf(1)
        var lastRow = firstRow

        repeat(rowIndex) {
            firstRow = lastRow

            lastRow = mutableListOf(1)

            for (j in 1 until firstRow.size) {
                lastRow.add(firstRow[j-1] + firstRow[j])
            }

            lastRow.add(1)
        }

        return lastRow
    }
}

fun main() {
    val solution = PascalTriangle2Solution()
    val result = solution.getRow(30)

    println(result.joinToString(separator = ","))
}