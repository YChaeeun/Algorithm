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
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        if (root == null) {
            return listOf()
        }

        val answer = mutableListOf<List<Int>>()
        
        val queue = LinkedList<TreeNode>()
        queue.add(root)
        
        while (queue.isNotEmpty()) {
            val nodes = mutableListOf<Int>()
            val qSize = queue.size
            
            for (i in 0 until qSize) {
                val node = queue.poll()
                
                nodes.add(node.`val`)
                
                if (node.left != null) {
                    queue.add(node.left)
                }
                
                if (node.right != null) {
                    queue.add(node.right)
                }
            }
            
            answer.add(nodes)
        }
        
        return answer
    }
}
