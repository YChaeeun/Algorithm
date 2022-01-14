class Solution {
    fun minimumLength(s: String): Int {
        if (s.length == 1) return 1
        
        var start = 0
        var end = s.lastIndex
        
        while (start < end && s[start] == s[end]) {            
            while(s[start+1] == s[end] && start+1 < end) start++
            while(s[start] == s[end-1] && start < end-1) end--
            
            start++
            end--
        }
        
        return end-start+1
    }
}
