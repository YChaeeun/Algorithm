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
        var result = ""
        
        while(temp != null) {
            result += temp.`val`
            temp = temp.next
        }
        
        return binaryToDecimal(result)
    }
    
    fun binaryToDecimal(binary: String) : Int {
        var answer = 0
        var expo = 1
        
        for (i in binary.length-1 downTo 0) {
            answer += (expo * Character.getNumericValue(binary[i]))
            
            expo *= 2
        }
        
        return answer
    }
}
