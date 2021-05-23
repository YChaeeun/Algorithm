"""
# Definition for a Node.
class Node:
    def __init__(self, val=None, children=None):
        self.val = val
        self.children = children
"""

class Solution:
    def preorder(self, root: 'Node') -> List[int]:
        if not root:
            return []
        
        answer = [root.val]
        stack = [root]

        while stack:
            if stack[-1].children:
                child = stack[-1].children.pop(0) # remove from original tree..?
                
                answer.append(child.val)
                if child.children:
                    stack.append(child)
            else:
                stack.pop()
        return answer
