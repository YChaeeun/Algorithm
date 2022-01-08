class Solution {
    fun diStringMatch(s: String): IntArray {
        val n = s.length
        
        val answer = IntArray(n + 1)
        
        var iIndx = 0
        var dIndx = n
        
        s.forEachIndexed { i, v ->
            answer[i] = if (v == 'I') iIndx++ else dIndx--
        }
        
        answer[n] = iIndx
        
        return answer
    }
}
