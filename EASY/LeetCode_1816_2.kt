class Solution {
    fun truncateSentence(s: String, k: Int): String {
        val sb = StringBuilder() 
        var n = k - 1
        
        for (c in s) {
            if (c == ' ') {
                n--
                if (n < 0) break
            }
            
            sb.append(c)    
        }
    
        return sb.toString()
    }
}
