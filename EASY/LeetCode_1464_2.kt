class Solution {
    fun maxProduct(nums: IntArray): Int {
        var max = 0
        var secondMax = 0
        
        nums.forEach { 
            if (it >= max) {
                secondMax = max
                max = it
            }
            
            if (it < max && it > secondMax) {
                secondMax = it
            }
        }
        
        return (max-1)*(secondMax-1)
    }
}
