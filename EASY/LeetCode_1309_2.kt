class Solution {
    fun freqAlphabets(s: String): String {
        val sb = StringBuilder()

        var i = s.length - 1
        
        while(i > -1) {
            if (s[i] == '#') {
                sb.appendNum(s.substring(i-2,i).toInt())
                i -= 3
            } else {
                sb.appendNum(Character.getNumericValue(s[i--]))
            }
        }
        
        return sb.toString().reversed()
    }
    
    fun StringBuilder.appendNum(num: Int) {
        val numToChar = 'a' + (num -1)
        append(numToChar)
    }
}
