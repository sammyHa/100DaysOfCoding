package leetCoding

import java.util.*
import java.util.LinkedList
import kotlin.collections.HashSet

/**
 * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
 * Follow up: Could you implement a solution with a linear runtime complexity and without using extra memory?
 *
 * Example 1:
 * Input: nums = [2,2,1]
 * Output: 1
 *
 * Example 2:
 * Input: nums = [4,1,2,1,2]
 * Output: 4
 *
 * Example 3:
 * Input: nums = [1]
 * Output: 1
 */
fun main(){
    val nums = intArrayOf(2,2,1,1,9,7,7,5,5)
    val sn = singleNumber3(nums)
    print(sn)
}
fun singleNumber(num: IntArray):Int{
    val set: HashSet<Int> = HashSet()
    for (e in num){
        if (set.contains(e)){
            set.remove(e)
        }else{
            set.add(e)
        }
    }
    for (i in set){
        return i
    }
    return  -1
}


fun singleNumber2(num: IntArray):Int{
    val set: Queue<Int> = LinkedList()
    for (i in num){
        if (set.contains(i)){
            set.remove(i)
        }else{
            set.offer(i)
        }
    }
    return set.element()
}

/**
 * using true.xor(false)
 */
fun singleNumber3(nums:IntArray):Int{
    var a = 0
    for (i in nums){
        a = a xor i

    }
    return a
}