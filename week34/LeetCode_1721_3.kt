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
    fun swapNodes(head: ListNode?, k: Int): ListNode? {
        var begin = head

        // kth from beginning
        for (i in 0 until k-1) {
            begin = begin?.next
        }

        // kth from end
        var end = head
        var last = begin?.next
        while(last != null) {
            end = end?.next
            last = last.next
        }
        
        // swap value
        if (begin != null && end != null) {            
            val temp = end.`val`
            end.`val` = begin.`val`
            begin.`val` = temp 
        }
        
        return head
    }
}
