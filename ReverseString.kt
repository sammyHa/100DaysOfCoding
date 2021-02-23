package leetCoding
/**
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

fun main() {
    val arr = charArrayOf('H','e','l','l','o')
    val s = reverseString3(arr)
    print(s)



}

fun reverseString(s:CharArray):CharArray{
    var left = 0
    var right = s.size-1
    while (left < right){
        val temp = s[left]
        s[left] = s[right]
        left++
        s[right ] = temp
        right--
    }
    return s


    }

fun reverseString2(s:CharArray):CharArray{
    var index = 0
    if (s.isEmpty()) return s
    while (index < s.size/2){
        val temp = s[index]
        s[index] = s[s.size- (index+1)]
        s[s.size -(index+1)] = temp
        index++

    }
    return s
}

fun reverseString3(s:CharArray):CharArray{
    swap1(s,0,s.size-1)
    return s

}

fun swap1(s: CharArray, left: Int, right: Int) {
    if (left >= right) return

    val temp = s[left]
    s[left] = s[right]
    s[right] = temp
    swap1(s, left + 1, right - 1)
}
