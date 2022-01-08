class Solution {
    fun diStringMatch(s: String): IntArray {
        val answer = mutableListOf<Int>()
        
        val perm = IntArray(s.length+1) {i -> i}
        var i = 0
        var d = s.length
        
        s.forEach {
            if (it == 'I') {
                answer.add(perm[i++])
            } else {
                answer.add(perm[d--])
            }
        }
        
        answer.add(perm[i++])
        
        return answer.toIntArray()
    }
}
