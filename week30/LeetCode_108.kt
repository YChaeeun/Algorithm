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
    fun sortedArrayToBST(nums: IntArray): TreeNode? {
        if (nums.isEmpty()) return null
        
        return bst(nums, 0, nums.size-1)
    }
    
    
    fun bst(nums: IntArray, start: Int, end: Int) : TreeNode? {
        if (start > end) return null
        
        val mid = (end + start) / 2
        
        val head = TreeNode(nums[mid])
        head.left = bst(nums, start, mid-1)
        head.right = bst(nums, mid+1, end)
        
        return head
        
    }
    
    fun print(treeNode: TreeNode) {
        var visited = LinkedList<TreeNode>()
        visited.add(treeNode)
        
        while (visited.isNotEmpty()) {
            val node = visited.poll()
            
            println(node.`val`)
            
            if (node.left != null) {
                visited.add(node.left)
            }
            
            if (node.right != null) {
                visited.add(node.right)
            }
        }
        
    }
}
