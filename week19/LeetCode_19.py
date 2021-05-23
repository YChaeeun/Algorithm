# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        temp = head
        count = 1
        
        while temp.next != None :
            count += 1
            temp = temp.next
            
        if count == n : # remove first node
            return head.next
            
        temp = tempTwo = head
        for _ in range(count-n) : # nth node from the end
            tempTwo = temp
            temp = temp.next
            
        tempTwo.next = temp.next # remove node that temp is pointing
            
        return head
