class Solution {
    fun maxProduct(nums: IntArray): Int {
        var max = 0
        
        for(i in nums.indices) {
            for(j in nums.indices) {
                if (i == j) continue
                val result = (nums[i]-1)*(nums[j]-1)
                if (max < result) max = result
            }
        }
        
        return max
    }
}
