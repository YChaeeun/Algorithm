class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        val sMap = HashMap<Char, Char>()
        val tMap = HashMap<Char, Char>()
        
        for (i in s.indices) {
            sMap[s[i]] = t[i]
            tMap[t[i]] = s[i]
        }
        
        for (i in s.indices) {
            if (s[i] != tMap[t[i]] || t[i] != sMap[s[i]]) return false
        }
        
        return true    
    }
}
