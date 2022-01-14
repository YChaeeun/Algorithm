class Solution {
    fun minimumLength(s: String): Int {
        if (s.length == 1) return 1
        
        val indexes = getDuplicatedIndex(s)
        
        var start = 0
        var end = indexes.lastIndex
        
        while (start < end) {            
            if (s[indexes[start]] != s[indexes[end]]) {
                break
            } 
            
            start++
            end--
        }
        
        return when {
            start == end -> {
                if (end != indexes.lastIndex && (indexes[end+1] - indexes[start]) == 1) 1
                else 0
            }
            end == indexes.lastIndex -> s.length
            else -> indexes[end+1] - indexes[start]
        }
    }
    
    fun getDuplicatedIndex(s: String): List<Int> {
        val indexes = mutableListOf<Int>()
        indexes.add(0)

        for (i in 1 until s.length) {
            if (s[i] != s[i-1]) indexes.add(i)    
        }
        
        return indexes
    }
}
