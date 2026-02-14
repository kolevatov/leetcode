package arrayAndStrings

// Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

class RotateArraySolution {
    fun rotate(nums: IntArray, k: Int): Unit {
        fun reverse(nums: IntArray, start: Int, end: Int) {
            var i = start
            var j = end
            while (i < j){
                val tmp = nums[i]
                nums[i] = nums[j]
                nums[j] = tmp
                i++
                j--
            }
        }

        val length = nums.size
        val n = k % length
        if (n == 0) return

        reverse(nums, 0, nums.size - 1)
        reverse(nums, 0, n - 1)
        reverse(nums, n, nums.size - 1)
    }
}

fun main() {
    val solution = RotateArraySolution()
    val nums = intArrayOf(1,2,3,4,5,6,7,8,9,10)

    solution.rotate(nums, 20)
}