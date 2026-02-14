package arrayAndStrings

/*
Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
The order of the elements may be changed.
Then return the number of elements in nums which are not equal to val.
 */

class RemoveElementSolution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var j = 0

        for (i in 0 until nums.size) {
            if (nums[i] != `val`) {
                nums[j] = nums[i]
                j++
            }
        }
        println(nums.joinToString(", "))
        return j
    }
}

fun main() {
    val s = RemoveElementSolution()
    val arr = intArrayOf(0,1,2,2,3,0,4,2)

    println(s.removeElement(arr, 2))
}