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
        
        var temp = head
        
        while(temp != null && temp.next != null) {
            if (temp.`val` == temp.next.`val`) temp.next = temp.next.next
            else temp = temp.next
        }
        
        return head
    }
}
