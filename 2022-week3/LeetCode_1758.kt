class Solution {
    fun minOperations(s: String): Int {
        var countStartZero = 0
        var countStartOne = 0
        
        s.forEachIndexed { i, c ->
            if (i%2 == 0) {
                if (c == '1') countStartZero++
                else countStartOne++
            } else {
                if (c == '0') countStartZero++
                else countStartOne++
            }
        }
        
        return Integer.min(countStartZero, countStartOne)
    }
}
