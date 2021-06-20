class Solution {
    fun findAndReplacePattern(words: Array<String>, pattern: String): List<String> {
        
        val pat = pattern.toSet().toList()
        val answer = ArrayList<String>()
        
        for (word in words) {
            val mapped = mutableMapOf(word[0] to pat[0])
            
            var p = pat[0].toString()
            var patC = 1
            
            for (i in 1 until word.length) {
                if (mapped.containsKey(word[i])) {
                    p += mapped.get(word[i])
                } else {
                    
                    if (patC < pat.size) {
                        mapped.put(word[i], pat[patC])
                        p += pat[patC++]
                    } else {
                        break
                    }
                }
            }
            
            if (p == pattern) {
                answer.add(word)
            }
        }
        
        return answer
    }
}
