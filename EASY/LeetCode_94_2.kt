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
    
    val answer = mutableListOf<Int>()
    
    fun inorderTraversal(root: TreeNode?): List<Int> {
        if (root == null) return listOf<Int>()
       
        inorderTraversal(root.left)
        answer.add(root.`val`)
        inorderTraversal(root.right)
        
        return answer
    }
}
