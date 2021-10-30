class Solution {
    fun countBits(n: Int): IntArray {
        val answer = IntArray(n+1)
        
        for (i in 1 until n+1) {
           answer[i] = i.toString(2).count { it == '1'}
        }
        
        return answer
    }
}
