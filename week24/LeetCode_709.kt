class Solution {
    fun toLowerCase(s: String): String {
        val chs = s.toCharArray()
        
        for(idx in chs.indices){
            if(chs[idx].toInt() >= 65 && chs[idx].toInt() < 91){ // faster than chs[idx] in 'A'..'Z' 
                chs[idx] = chs[idx] + ('a' - 'A')
            }
        }
        
        return String(chs)
    }
}
