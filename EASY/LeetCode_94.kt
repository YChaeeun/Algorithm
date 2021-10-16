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
    fun inorderTraversal(root: TreeNode?): List<Int> {
        if (root == null) return listOf<Int>()
       
        val answer = mutableListOf<Int>()
        inorder(root, answer)
 
        return answer.toList()
    }

    fun inorder(root: TreeNode?, answer: MutableList<Int> ) {
        if(root == null) return
        
        inorder(root.left, answer)
        answer.add(root.`val`)
        inorder(root.right, answer)
    }
}
