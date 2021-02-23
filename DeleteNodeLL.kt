package leetCoding

/**
 * Delete the node in a linked list
 *
 * Write a function to delete a node in a singly-linked list. You will not be given access to the head of the list, instead you will be given access to the node to be deleted directly.
    It is guaranteed that the node to be deleted is not a tail node in the list.
 *
 * Input: head = [4,5,1,9], node = 5
Output: [4,1,9]
Explanation: You are given the second node with value 5, the linked list should become 4 -> 1 -> 9 after calling your function.
 */


fun deleteNode(node:Node){
    node?:return // check if node is null then just return

   /**  4-->5-->1-->6-->9 here delete the 5 */
    node.data = node.next!!.data /** override the value of current node with the next node value*/
    node.next = node.next!!.next /** assign the pointer to the next.next node */


}

/** second solution */
fun deleteNode2(node: ListNode?) {
        if(node != null){
        var current = node
        var next = current.next
        current.data = next.data
        current.next = next.next
        }
    }

/** third Solution */
fun deleteNode3(node: ListNode?) {
    
        if(node == null) return
        
        node.data = node.next?.data ?: 0
        node.next = node.next.next
    }
