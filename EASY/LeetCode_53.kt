class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var sum = nums[0]
        var max = nums[0]
        
        for(i in 1 until nums.size) {
            if (sum + nums[i] > nums[i]) {
                sum += nums[i]
            } else {
                sum = nums[i]
            }
            
            if (max < sum) {
                max = sum
            }
        }
        
        return max
    }
}
