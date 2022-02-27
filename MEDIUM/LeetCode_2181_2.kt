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
    fun mergeNodes(head: ListNode?): ListNode? {
        if (head == null) return null
        
        var temp = head
        var sumValue = 0 
        
        while (temp?.next != null) {
            if (temp.next?.`val` == 0) {
                temp.next?.`val` = sumValue
                temp = temp.next
                sumValue = 0
            } else {
                sumValue += temp.next?.`val` ?: 0
                temp.next = temp.next?.next
            }
        }
        
        return head.next
    }
}
