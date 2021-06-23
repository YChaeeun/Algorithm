class Solution {
    fun longestStrChain(words: Array<String>): Int {
    
        val chain = HashMap<String, Int>()
        
        val sortWord = words.sortedBy {it.length}
        
        sortWord.forEach { word ->
            var max = 1
            
            for (i in word.indices) {
                
                val w = word.filterIndexed { index, _ -> index != i }
                var value = chain.getOrDefault(w, 0) + 1
                
                if (value > max) {
                    max = value
                }    
            }
            
            chain[word] = max

        }
        
        return chain.values.max() ?: 1
        
    }
}
