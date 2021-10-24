class Solution {
    fun decode(encoded: IntArray, first: Int): IntArray {
        val answer = IntArray(encoded.size+1) {first}
        
        for (i in 1 until answer.size) {
            answer[i] = answer[i-1] xor encoded[i-1]
        }

        return answer
    }
}
