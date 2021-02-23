import java.util.*
import kotlin.collections.ArrayDeque
import kotlin.math.max

class Node(var data: Int) {
    var left: Node? = null
    var right: Node? = null

}


/**
 * Given the root of a binary tree, return its maximum depth.

A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.



Example 1
 */
//         3
//       /   \
//      9     20
//           /  \
//          15   7
//          / \
//         4   5

fun main() {
    val node2 = Node(2)
    val node3 = Node(3)
    val node4 = Node(4)
    val node5 = Node(5)
    val node6 = Node(6)




    node2.left = null
    node2.right = node3
    node3.left = null
    node3.right = node4
    node4.left = null
    node4.right = node5
    node5.left = null
    node5.right = node6


//    val node1 = Node(1)
//    val node2 = Node(2)
//
//    node1.left = node2
//    node1.right = null




    //println(maxDepth(node3))
//    print(minDepth(node1))
    print(minDepthQ(node2))
}
//fun sumValues(root: Node?): Int {
//    return if (root == null) {
//        0
//    } else root.data + sumValues(root.left) + sumValues(root.right)
//}

fun maxDepth(root: Node?): Int {
    if (root == null) return 0
    val left : Int = maxDepth(root.left)
    val right : Int = maxDepth(root.right)
    //return  maxOf(left, right) + 1
    return maxOf(left, right) + 1


}

fun minDepth(root:Node?):Int{
    if (root == null) return 0
    if (root.left == null){
        return  minDepth(root.right) + 1
    }
    if (root.right == null){
        return minDepth(root.left) + 1
    }
    val left: Int = minDepth(root.left)
    val right:Int = minDepth(root.right)
    return minOf(left, right) + 1
}



fun minDepthQ(root: Node?):Int{

    if (root==null) return 0

    val queue: Queue<Node> = LinkedList()

    var level = 1
    queue.add(root)

    while (queue.isNotEmpty()){

        for (i in 0 until queue.size){
            val node = queue.poll()
            if (node.left == null && node.right == null){
                return  level
            }

            if (node.left != null) queue.offer(node.left)
            if (node.right != null) queue.offer(node.right)
        }
        level++
    }
    return level

}








