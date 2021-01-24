
# LeetCode - medium
# https://leetcode.com/problems/add-two-numbers/

# Improvements
# 1. remove repeated part to one while loop

class Solution:
def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
    answer = ref = ListNode()
    carry = 0
    
    while(l1 != None or l2 != None or carry != 0) :
        addResult = carry
        
        if l1 != None :
            addResult += l1.val
            l1 = l1.next
        
        if l2 != None :
            addResult += l2.val
            l2 = l2.next
        
        carry = addResult // 10
            
        ref.next = ListNode(addResult % 10)
        ref = ref.next
        
    return answer.next
    
