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
    fun isSameTree(p: TreeNode?, q: TreeNode?): Boolean {
        
        val queueP : Queue<TreeNode> = LinkedList()
        queueP.add(p)
        
        val queueQ : Queue<TreeNode> = LinkedList()
        queueQ.add(q)
        
        while (queueP.isNotEmpty() && queueQ.isNotEmpty()) {
            val pollP = queueP.poll()
            val pollQ = queueQ.poll()
            
            if (pollP == null && pollQ == null) continue
            if (pollP == null || pollQ == null) return false
            
            if (pollP.`val` != pollQ.`val`) return false
            
            queueP.add(pollP.left)
            queueP.add(pollP.right)
            
            queueQ.add(pollQ.left)
            queueQ.add(pollQ.right)
        }
        
        return true
    }
}
