class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var sum = 0
        var max = Int.MIN_VALUE
        
        nums.forEach {
            sum += it
            
            if (sum > max) {
                max = sum
            }
            
            if (sum < 0) {
                sum = 0
            }
        }
        
        return max
    }
}
