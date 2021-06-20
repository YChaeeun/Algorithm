class Solution {
    fun findAndReplacePattern(words: Array<String>, pattern: String): List<String> {
        
        val p = mapString(pattern)
        val answer = mutableListOf<String>()
        
        words.forEach { word ->
            if(p.contentEquals(mapString(word))) {
                answer.add(word)
            }
        }
        
        return answer
    }
    
    fun mapString(str: String): Array<Int> {
        val letters = Array(26) { -1 }
        val res = Array(str.length) { 0 }
        var count = 1
        
        for(i in str.indices) {
            val ch = str[i] - 'a'
            if(letters[ch] == -1) {
                letters[ch] = count++
            }
            res[i] = letters[ch]
        }
        
        return res
    }
}
