class Solution {
    fun replaceDigits(s: String): String {
        val answer = StringBuilder()
        
        var i = 0
        while (i < s.length-1) {
            answer.append(s[i])
            answer.append(s[i]+(s[i+1]-'0'))   
            
            i += 2
        }
        
        if (i < s.length) {
            answer.append(s[i])
        }
        
        return answer.toString()
    }
}
