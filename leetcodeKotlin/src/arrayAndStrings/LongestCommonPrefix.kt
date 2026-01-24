package arrayAndStrings

/*
Write a function to find the longest common prefix string amongst an array of strings.
If there is no common prefix, return an empty string "".
 */
class LongestCommonPrefix {
    fun longestCommonPrefix(strs: Array<String>): String {

        // find substring from all array members
        fun findSubstr(strs: Array<String>, substr: String): Boolean {
            for (str in strs) {
                if (!str.startsWith(substr)) return false
            }

            return true
        }

        var prefix = ""
        for (i in 1..strs[0].length) {

            if (findSubstr(strs, strs[0].take(i))) {
                prefix = strs[0].take(i)

            } else break
        }
        return prefix
    }
}

fun main() {
    val prefix = "auto"

    val words = arrayOf(
        "${prefix}mobile",
        "${prefix}matic",
        "${prefix}pilot"
    )

    val long = LongestCommonPrefix()
    println("Result: ${long.longestCommonPrefix(words)}")

}