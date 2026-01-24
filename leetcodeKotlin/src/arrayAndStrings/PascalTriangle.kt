package arrayAndStrings

class PascalTriangle {
    fun generate(numRows: Int): List<List<Int>> {
        val result = mutableListOf<List<Int>>()
        var row = mutableListOf(1)

        // default first row
        result.add(row)

        for (i in 1..<numRows) {
            val prevRow = result[i - 1]

            //println("$i,$prevRow")

            row = mutableListOf()
            row.add(1)

            for (j in 1..<prevRow.size) {
                row.add(prevRow[j-1] + prevRow[j])
            }

            row.add(1)
            result.add(row)
        }

        return result
    }
}

fun main() {
    val tr = PascalTriangle()
    val array = tr.generate(2)

    for (ints in array) {
        println(ints.joinToString())

    }
}