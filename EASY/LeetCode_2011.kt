class Solution {
    fun finalValueAfterOperations(operations: Array<String>): Int {
        var sum = 0
        
        operations.forEach {
            if (it[1] == '+') sum++
            else sum--
        }
        
        return sum
    }
}
