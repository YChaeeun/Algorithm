class Solution {
    fun check(nums: IntArray): Boolean {
        var count = 0
        
        for (i in nums.indices) {
            for (j in i until nums.size + i - 1) {
                
                if (nums[j % nums.size] > nums[(j+1) % nums.size]) {
                    count = 0
                    break;
                }
                
                count++
            }
            
            if (count == nums.size - 1) return true
        }
    
        return false
    }
}
