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
    fun deleteDuplicates(head: ListNode?): ListNode? {
        if (head == null) return head
        
        var start = ListNode(-101)
        var end = start
        var temp = head
        
        while(temp != null && end != null) {
            if (temp.`val` != end.`val`) {
                end.next = ListNode(temp.`val`)
                end = end.next
            }
            
            temp = temp.next
        }
        
        return start.next
    }
}
