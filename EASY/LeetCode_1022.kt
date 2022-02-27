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
    fun sumRootToLeaf(root: TreeNode?): Int {
        return dfs(root, 0)
    }
    
    fun dfs(node: TreeNode?, num: Int): Int {
        if (node == null) return 0
        
        val bitsToBase10 = num * 2 + node.`val`    
        if (node.left == null && node.right == null) return bitsToBase10
        
        return dfs(node.left, bitsToBase10) + dfs(node.right, bitsToBase10)
    }
}
