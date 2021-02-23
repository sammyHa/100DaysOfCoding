package leetCoding

/**
 * /**
Write a function that reverses a string. The input string is given as an array of characters char[].

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

You may assume all the characters consist of printable ascii characters.



Example 1:

Input: ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]
*/
 *
 */
fun main(){
    val charArr = charArrayOf('H','a','n','n','a','h')
    val rs = reverseStr(charArr)
    print(rs)
}

fun reverseStr(s:CharArray):CharArray{
    swap(s, 0, s.size -1)
    return s
}

fun swap(s:CharArray, left:Int, right:Int){
    if (left >= right) return
    val temp = s[left]
    s[left] = s[right]
    s[right] = temp
    swap(s, left + 1, right - 1)
}






