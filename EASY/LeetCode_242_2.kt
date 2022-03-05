class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val countS = IntArray(26)
        val countT = IntArray(26)
        
        s.forEach {
            countS[it-'a']++
        }
        
        t.forEach {
            countT[it-'a']++
        }
    
        for(i in 0 until countS.size) {
            if (countS[i] != countT[i]) return false
        }
        
        return true
    }
}
