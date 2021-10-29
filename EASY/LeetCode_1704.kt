class Solution {
    fun halvesAreAlike(s: String): Boolean {
        var count = 0
        val vowels = "aeiouAEIOU"
        
        for (i in 0 until s.length/2) {
            if (s[i] in vowels) {
                count++
            }
        }
        
        
        for (i in s.length/2 until s.length) {
            if (s[i] in vowels) {
                count--
            }
        }
    
        return count == 0
    }
}
