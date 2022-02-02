class Solution {
    fun minOperations(boxes: String): IntArray {
        val answer = IntArray(boxes.length)
        
        var countOne = 0            // 이동시킬 1의 개수
        var accumulatedMoves = 0    // 누적된 이동 횟수
        boxes.forEachIndexed { i, v ->
            answer[i] = accumulatedMoves
            
            if (v == '1') {
                countOne++
            }
            
            accumulatedMoves += countOne // 다음 자리로 이동할 1의 개수만큼 횟수 증가
        }
     
        countOne = 0
        accumulatedMoves = 0
        for(i in boxes.length-1 downTo 0) {
            answer[i] += accumulatedMoves
            
            if (boxes[i] == '1') {
                countOne++
            }
            
            accumulatedMoves += countOne
        }
        
        return answer
    }
}
