# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        begin = end = head
        
        while end.next != None : # begin -- distance n -- end
            if n == 0 :
                begin = begin.next
            else :
                n -= 1
            
            end = end.next
        
        if n > 0 :
            return head.next
        
        begin.next = begin.next.next # begin : pointing previous node that need to be removed
        
        return head
        
