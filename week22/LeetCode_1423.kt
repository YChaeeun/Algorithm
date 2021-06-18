class Solution {
    fun maxScore(cardPoints: IntArray, k: Int): Int {
        val dp = IntArray(k/2+1){0}
        val start = cardPoints.take(k).toMutableList()
        val end = cardPoints.takeLast(k).toMutableList()
        
        end.reverse()
        
        for (i in 1 until start.size) {
            start[i] += start[i-1]
            end[i] += end[i-1]
        }
        
        for (i in 0 until dp.size) {
            
            dp[i] = when{
                i == 0 -> maxOf(start[k-i-1], end[k-i-1])
                else -> maxOf(start[i-1]+end[k-i-1], start[k-i-1]+end[i-1]) 
            }
        }
 
        return dp.max() ?: 0
   
