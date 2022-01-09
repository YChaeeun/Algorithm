class Solution {
    fun maxAbsoluteSum(nums: IntArray): Int {
        val maxSum = IntArray(nums.size) { nums[0] }
        val minSum = IntArray(nums.size) { nums[0] }
        
        for (i in 1 until nums.size) {
            maxSum[i] = Integer.max(nums[i], nums[i] + maxSum[i-1])
            minSum[i] = Integer.min(nums[i], nums[i] + minSum[i-1])
        }
    
        return Integer.max(Math.abs(maxSum.max() ?: 0), Math.abs(minSum.min() ?: 0))    
    }
}
