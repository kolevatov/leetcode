package arrayAndStrings

/*
Write a function that reverses a string. The input string is given as an array of characters s.
You must do this by modifying the input array in-place with O(1) extra memory.
 */

class ReverseString {
    fun reverseString(s: CharArray): Unit {
        var i = 0
        var j = s.size - 1

        while (i < j){
            val ch = s[i]
            s[i] = s[j]
            s[j] = ch
            i++
            j--
        }
        println(s)
    }
}

fun main() {
    val s = charArrayOf('H','a','n','n','a','h','a','h')

    ReverseString().reverseString(s)
}