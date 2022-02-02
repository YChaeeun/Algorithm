class Solution {
    fun minOperations(boxes: String): IntArray {
        if (boxes.length < 2) return IntArray(1)
        
        val indexes = boxes.mapIndexed{ i, v -> if(v=='1') i else null }.filterNotNull()

        val answer = IntArray(boxes.length)
        
        boxes.forEachIndexed { i, v ->
            indexes.forEach { index ->
                answer[i] += Math.abs(index-i)
            }
        }
    
        return answer
    }
}
