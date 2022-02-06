class Solution {
    fun threeConsecutiveOdds(arr: IntArray): Boolean {
        var countConsecutive = 0
        
        for(num in arr) {
            if (num % 2 == 0) { 
                countConsecutive = 0
            } else {
                countConsecutive += 1
            }
            
            if (countConsecutive == 3) return true
        }
        
        
        return false
    }
}
