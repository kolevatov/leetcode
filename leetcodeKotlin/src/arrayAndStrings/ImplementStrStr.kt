package arrayAndStrings
/*
Given two strings needle and haystack,
return the index of the first occurrence of needle in haystack,
or -1 if needle is not part of haystack.
 */

class ImplementStrStr {
    fun strStr(haystack: String, needle: String): Int {
        val h = haystack.length
        val n = needle.length

        // check corner cases first
        if ((h < n) || (h == n && haystack != needle)) return -1

        // external loop for sliding window
        for (i in 0..h - n) {

            for (j in 0..n - 1) {

                if (haystack[i + j] != needle[j]) break

                if (j == n - 1) return i
            }

        }
        return -1
    }
}

fun main() {
    val strStr = ImplementStrStr()
    println("\nResult: ${strStr.strStr(haystack = "sadbutzad", needle = "adbutzad")}")
}