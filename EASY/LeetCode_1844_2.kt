class Solution {
    fun replaceDigits(s: String): String {
        val answer = StringBuilder()
        
        for (i in s.indices) {
            if (i % 2 == 0) {
                answer.append(s[i])
            } else {
                answer.append(s[i-1] + Character.getNumericValue(s[i]))
                // answer.append(s[i-1]+s[i].toString().toInt())
            }
        }
        
        return answer.toString()
    }
}
