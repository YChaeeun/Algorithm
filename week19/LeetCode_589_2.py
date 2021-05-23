"""
# Definition for a Node.
class Node:
    def __init__(self, val=None, children=None):
        self.val = val
        self.children = children
"""

class Solution:
    def preorder(self, root: 'Node') -> List[int]:
        result = []
        visited = []
        stack = [root]
        
        while stack != [] :
            node = stack.pop()
            
            if not node :
                continue
        
            if node not in visited :
                for _ in range(len(node.children)-1) : # children can be more than 2
                    stack.append(node)
                
                result.append(node.val)
                visited.append(node)  # different nodes can have same node.val
            
            for child in node.children :
                if child not in visited :
                    stack.append(child)
                    break
        
        return result
