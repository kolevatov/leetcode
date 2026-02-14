package arrayAndStrings

/*
Given an input string s, reverse the order of the words.
A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
Return a string of the words in reverse order concatenated by a single space.
Note that s may contain leading or trailing spaces or multiple spaces between two words.
The returned string should only have a single space separating the words. Do not include any extra spaces.
 */
class ReverseWordsStringSolution {
    fun reverseWords(s: String): String {
        // convert String into list of strings
        val words = s.trim().split("\\s+".toRegex())
        return words.reversed().joinToString(" ")
    }
}

fun main() {
    val str = "  the sky is  blue world"
    println(ReverseWordsStringSolution().reverseWords(str))
}

