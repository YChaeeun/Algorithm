class Solution:
    def addOneRow(self, root: TreeNode, val: int, depth: int) -> TreeNode:
        
        visited = [root]
        
        while visited != [] :
            value = visited.pop(0)
            
            if (value.left != None) :
                visited.append(value.left)
                
            if (value.right != None) :
                visited.append(value.right)
        
        return root
