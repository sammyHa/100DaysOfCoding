package leetCoding
/**
 * Given the head of a singly linked list, reverse the list, and return the reversed list.
 *
 * Input: head = [1,2,3,4,5]
 * Output: [5,4,3,2,1]
 */
class ListNode(var data:Int){
    var next: ListNode? = null
}
fun reverseList(head: ListNode?): ListNode? {
    var head = head
    var prev: ListNode? = null
    var temp: ListNode?
    while (head != null){
        temp = head
        head = head.next
        temp.next = prev
        prev = temp
    }
    return prev
}
