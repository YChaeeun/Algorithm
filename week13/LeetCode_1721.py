# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def swapNodes(self, head: ListNode, k: int) -> ListNode:
        
        # points to Kth from the beginning
        tempK = head
        for i in range(k-1) :
            tempK = tempK.next
        
        # size of head
        length = 0
        temp = head
        while temp != None :
            length += 1
            temp = temp.next
            
        # points to Kth from the end
        temp = head
        for i in range(length-k) :
            temp = temp.next
            
        # swap value
        tempK.val, temp.val = temp.val, tempK.val
        
        return head
