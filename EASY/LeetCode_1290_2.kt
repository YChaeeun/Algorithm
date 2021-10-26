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
    fun getDecimalValue(head: ListNode?): Int {
        if (head == null) return 0
        
        var temp = head
        var binary = ""
        
        while(temp != null) {
            binary += temp.`val`
            temp = temp.next
        }
        
        return binary.toInt(2)
    }
}
