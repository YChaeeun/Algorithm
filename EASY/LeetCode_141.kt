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
    fun hasCycle(head: ListNode?): Boolean {
        var one = head
        var two = head
        
        while(one != null && two != null && two.next != null) {
            one = one.next
            two = two.next.next
            
            if (one == two) return true
        }
        
        return false
    }
}
