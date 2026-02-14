package arrayAndStrings

/*
Given a binary array nums, return the maximum number of consecutive 1's in the array.
 */

class MaxConsecutiveOnesSolution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var max = 0
        var current = 0

        for (i in 0 until nums.size) {
            if (nums[i] == 1){
                current++
                if (i == nums.size - 1) max = maxOf(max, current)
            } else {
                max = maxOf(max, current)
                current = 0
            }
        }
        return max
    }
}

fun main() {
    val s = MaxConsecutiveOnesSolution()
    val arr = intArrayOf(0,1,1,0,0,1,1,0)

    println(s.findMaxConsecutiveOnes(arr))
}