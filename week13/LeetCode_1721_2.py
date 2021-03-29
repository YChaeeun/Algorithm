# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def swapNodes(self, head: ListNode, k: int) -> ListNode:
        
        # points to beginning Kth
        beginK = head
        for i in range(k-1):
            beginK = beginK.next
            
        # points to end Kth
        temp = beginK.next
        endK = head
        while temp:
            temp = temp.next
            endK = endK.next
            
        # swap
        beginK.val, endK.val = endK.val, beginK.val
       
        return head
