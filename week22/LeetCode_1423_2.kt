class Solution {
    fun maxScore(cardPoints: IntArray, k: Int): Int {
        var totalMax = 0
        var startMax = 0
        var endMax = 0
        var n = cardPoints.size 
        
        for( i in 0 until k ) {
            startMax += cardPoints[i]
        }
        
        totalMax = startMax
        
        for (i in k - 1 downTo 0 ) {
            endMax += cardPoints[ n - ( k - i ) ]
            startMax -= cardPoints[i]
            
            totalMax = maxOf(totalMax, startMax + endMax)
            
        }
        
        return totalMax
    }
}
