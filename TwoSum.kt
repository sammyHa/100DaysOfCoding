package leetCoding

/**
 * '''
Given an array of integers, return indices of the  two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may NOT use the same elements twice.

Example:
given nums = [2, 7, 11, 15], taget = 9

because nums[0] + nums[1] = 2 + 7 = 9
return [0, 1]
'''
 */
fun main(){
    val nums = listOf(2, 7, 11, 15)

    val target = 9
    //bruteForcetTwoSum(nums, target)
    twoSum(nums, target)
}

fun bruteForcetTwoSum(list: List<Int>, target: Int){
    // using the brut force method
    for(i in 0..list.size){
        for (j in i+1 until(list.size)){
            val sum = list[i] + list[j]

            if (sum == target){
                print("$i, $j")
            }
        }
    }

}

fun twoSum(list: List<Int>, target: Int){

    val maps = hashMapOf<Int, Int>()
    for (i in list.indices){
        val complement = target - list[i]
        if (maps.containsKey(complement)){
            val t = list[i] + complement //show the target value
            print("${maps.get(i)}, $i")

        }
        else {
            maps[complement] = 1
        }

            //print("${maps.keys}") // keys print the actual values and the index is values

    }

}