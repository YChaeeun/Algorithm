class Solution { 
    fun firstUniqChar(s: String): Int {
        val count = IntArray(26)
        
        s.forEach {
            count[it-'a']++
        }
        
        for (i in s.indices) {
            if (count[s[i]-'a'] == 1) return i
        }
        
        return -1
    }
}
