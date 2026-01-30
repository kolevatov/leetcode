package arrayAndStrings

class PlusOneSolution {
    fun plusOne(digits: IntArray): IntArray {
        for (i in digits.indices.reversed()) {
            if (digits[i] == 9) {
                digits[i] = 0
            } else {
                digits[i] += 1
                return digits
            }

        }
        return intArrayOf(1) + digits
    }
}

fun main(){
    val solution = PlusOneSolution()
    val intArray = intArrayOf(9,9,9,9,9)
    println(solution.plusOne(intArray).joinToString())
}