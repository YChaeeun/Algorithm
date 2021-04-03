class Solution:
    def addOneRow(self, root: TreeNode, val: int, depth: int) -> TreeNode:

        if depth == 1:
            return TreeNode(val, left = root)
        
        visited = [(root,1)]
        dep = 1
    
        while visited != [] :
            value = visited.pop(0)        
            
            if (value[0].left != None) :
                visited.append((value[0].left, dep))

            if (value[0].right != None) :
                visited.append((value[0].right, dep))
                
            dep += 1
                
            if (value[1] == depth-1) :
                value[0].left = TreeNode(val, right = None, left = value[0].left)
                value[0].right = TreeNode(val, right = value[0].right, left = None) 

        return root
