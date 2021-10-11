/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        val head = ListNode()
        var last = head
        
        var one = l1
        var two = l2
        
        while (one != null && two != null) {
            if (one.`val` < two.`val`) {
                last.next = one
                last = last.next
                
                one = one.next
            } else {
                last.next = two
                last = last.next
                
                two = two.next
            }
        }
        
        
        if (one != null) {
            last.next = one
        }
        
        if (two != null) {
            last.next = two
        }
        
        return head.next
    }
}
