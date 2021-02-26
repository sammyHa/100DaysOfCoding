package leetCoding

/**
 * Write a program that outputs the string representation of numbers from 1 to n.

But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”.
For numbers which are multiples of both three and five output “FizzBuzz”.

Example:

n = 15,

Return:
["1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"]
 */

fun main() {
    val n = 15

    print(fizzBuzz(n))

}
fun fizzBuzz(n:Int):List<String>{

    val lst = mutableListOf<String>()
    for (i in 1..n){
        if (i%5 == 0 && i%3 == 0) {
            lst.add("FizzBuzz")
        }
        else if (i%3==0){
            lst.add("Fizz")
        }else if(i%5 ==0){
            lst.add("Buzz")
        }else{
            lst.add(i.toString())
        }
    }
    return lst

}