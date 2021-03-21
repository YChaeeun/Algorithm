# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def getIntersectionNode(self, headA: ListNode, headB: ListNode) -> ListNode:
        lenA = 0
        lenB = 0
        
        temp = headA
        while temp != None :
            lenA += 1
            temp = temp.next
            
            
        temp = headB
        while temp != None :
            lenB += 1
            temp = temp.next
            
            
        tempA = headA
        tempB = headB
        
        if (lenA > lenB) :
            for i in range(lenA-lenB) :
                tempA = tempA.next
        elif (lenA < lenB) :
            for i in range(lenB - lenA) :
                tempB = tempB.next
        
        while tempA != None and tempB != None:
            if (tempA == tempB) :
                return tempA
            
            tempA = tempA.next
            tempB = tempB.next
            
        return None
