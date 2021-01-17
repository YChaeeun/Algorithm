
# LeetCode
# https://leetcode.com/problems/deepest-leaves-sum/

class Solution:
    def deepestLeavesSum(self, root: TreeNode) -> int:
        
        if root == None:
            return 0
     
        parent = [root]
        
        while parent:
            child = []
            leavesSum = 0

            for node in parent:
                leavesSum += node.val
                if node.left:
                    child.append(node.left)
                if node.right:
                    child.append(node.right)

            parent = child

        return leavesSum
