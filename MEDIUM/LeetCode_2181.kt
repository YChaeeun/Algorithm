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
        
        var merge = head
        var temp = head
        var sumValue = 0 
        
        while (temp != null) {
            if (temp.`val` != 0) {
                sumValue += temp.`val`
            } else if (sumValue != 0 && merge != null) {                    
                merge.next = ListNode(sumValue)
                merge = merge.next
                sumValue = 0  
            }
            temp = temp.next
        }
        
        return head.next
    }
}
