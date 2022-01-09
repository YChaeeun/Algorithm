class Solution {
    fun check(nums: IntArray): Boolean {
        if (nums.size < 3) return true
        var count = 0
        
        for (i in 0 until nums.size * 2) {
            if (nums[i % nums.size] > nums[(i+1) % nums.size]) {
                count = 0
            } else {
                count++
            }
            
            if (count == nums.lastIndex) return true
        }
        
        return false
    }
}
