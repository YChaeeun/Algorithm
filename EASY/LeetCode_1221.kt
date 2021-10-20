class Solution {
    fun balancedStringSplit(s: String): Int {
        var count = 0
        
        var flag = 0
        
        s.forEach {
            if (it == 'L') flag++
            if (it == 'R') flag--
            
            if (flag == 0) count++
        }
        
        return count
    }
}
