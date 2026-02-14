package arrayAndStrings

/*
Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
Constraints:
1 <= s.length <= 5 * 104
s contains printable ASCII characters.
s does not contain any leading or trailing spaces.
There is at least one word in s.
All the words in s are separated by a single space.
 */
class ReverseWordsString3Solution {
    fun reverseWords(s: String): String {
        val words = s.split(" ").toMutableList()

        for (i in words.indices) {
            words[i] = words[i].reversed()
        }

        return words.joinToString(" ")
    }
}

fun main() {
    val str = "Let's take LeetCode contest"
    println(ReverseWordsString3Solution().reverseWords(str))
}