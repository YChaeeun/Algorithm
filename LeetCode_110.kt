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
    fun isBalanced(root: TreeNode?): Boolean {
        if (root == null) return true
        
        val differHeight = Math.abs(depth(root.left) - depth(root.right))
        
        return differHeight in 0..1 && isBalanced(root.left) && isBalanced(root.right)
    }
    
    fun depth(root: TreeNode?) : Int {
        if (root == null) return 0
        
        return 1+ Math.max(depth(root.left), depth(root.right))
    }
}
