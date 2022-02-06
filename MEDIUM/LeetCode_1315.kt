/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    fun sumEvenGrandparent(root: TreeNode?): Int {
        val queue = LinkedList<TreeNode>()
        var sum = 0
        
        if (root != null) queue.add(root)
        
        while(queue.isNotEmpty()) {
            val head = queue.pop()
            
            if (head.left != null) {
                queue.add(head.left)
                if (head.`val` % 2 == 0) {
                    if (head.left.left != null) {
                        sum += head.left.left.`val`
                    }
                    if (head.left.right != null) {
                        sum += head.left.right.`val`
                    }
                }   
            }
            
            if (head.right != null) {
                queue.add(head.right)
                if (head.`val` % 2 == 0) {
                    if (head.right.left != null) {
                        sum += head.right.left.`val`
                    }
                    if (head.right.right != null) {
                        sum += head.right.right.`val`
                    }
                }  
            }
        }
        
        return sum
    }
}
