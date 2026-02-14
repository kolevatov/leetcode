package arrayAndStrings

/*
Given an array of positive integers nums and a positive integer target,
return the minimal length of a subarray whose sum is greater than or equal to target.
If there is no such subarray, return 0 instead.
 */
class MinSubArrayLenSolution {
    fun minSubArrayLen(target: Int, nums: IntArray): Int {
        var left = 0
        var currentSum = 0  // sum of the elements for current sliding window
        var elementsCount = Int.MAX_VALUE   // min elements number

        for (right in 0 until nums.size) {
//            println("left: $left, right: $right, elementsCount: $elementsCount")
            // move right pointer till get the sum value
            currentSum += nums[right]
//            println("new sum: $currentSum")

            // move left pointer - try to remove element from sliding window
            while (currentSum >= target) {
//                println("execute while")
                // update element count
                elementsCount = elementsCount.coerceAtMost(right - left + 1)
//                println("new elementsCount: $elementsCount")
                // update elements sum
                currentSum -= nums[left++]
//                println("new sum: $currentSum")
            }
        }

        return if (elementsCount == Int.MAX_VALUE) 0 else elementsCount
    }
}

fun main() {
    val solution = MinSubArrayLenSolution()
    val target = 11
    val arr = intArrayOf(1,1,1,1,1,1,1,1)

    println("result: ${solution.minSubArrayLen(target, arr)}")
}