
# LeetCode - medium
# https://leetcode.com/problems/add-two-numbers/

class Solution:
def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
    answer = ref = ListNode()
    carry = 0
    
    while(l1 != None and l2 != None) :
        addResult = carry + l1.val + l2.val
        carry = addResult // 10
            
        ref.next = ListNode(addResult % 10)
        ref = ref.next
            
        l1 = l1.next
        l2 = l2.next
        
        
    while l1 != None :
        addResult = carry + l1.val
        carry = addResult // 10
        
        ref.next = ListNode(addResult % 10)
        ref = ref.next
        
        l1 = l1.next

        
    while l2 != None :
        addResult = carry + l2.val
        carry = addResult // 10
        
        ref.next = ListNode(addResult % 10)
        ref = ref.next
        
        l2 = l2.next

    if carry == 1 :
        ref.next = ListNode(carry)
        
    return answer.next
