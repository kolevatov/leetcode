package arrayAndStrings

/*
    Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order,
    find two numbers such that they add up to a specific target number.
    Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
*/
class NumbersSum {
    fun twoSum(numbers: IntArray, target: Int): IntArray {
        var i = 0
        var j = numbers.size - 1

        while (i < j) {
            val sum = numbers[i] + numbers[j]

            if (sum == target) {
                return intArrayOf(i + 1, j + 1)
            }
            if (sum < target){
                i++
            } else {
                j--
            }
        }

        return intArrayOf(-1, -1)
    }
}

fun main() {
    val s = NumbersSum()
    println(s.twoSum(intArrayOf(2,3,4), 6).joinToString(",") )
}