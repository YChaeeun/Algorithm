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
    fun reverseList(head: ListNode?): ListNode? {
        var next = head
        var start = ListNode(-1)
        
        while (next != null) {
            val new = ListNode(next.`val`)
            new.next = start.next
            
            start.next = new
            
            next = next.next
        }
        
        return start.next
    }
}
