class Solution {
    fun partitionDisjoint(nums: IntArray): Int {
        var maxL = nums[0]
        var max = nums[0]
        var idxL = 0
        
        for (i in 1 until nums.size) {
            if (nums[i] < nums[idxL] || nums[i] < maxL) { // smaller left
                idxL = i
                maxL = max
            }
            
            if (nums[i] > max) {
                max = nums[i]
            }    
        }
        
        return idxL + 1
    }
}
