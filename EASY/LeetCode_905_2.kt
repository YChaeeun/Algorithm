class Solution {
    fun sortArrayByParity(nums: IntArray): IntArray {
        if (nums.size == 1) return nums
        
        var start = 0
        var end = nums.size -1
        while (start < end) {
            if (nums[start] % 2 != 0 && nums[end] % 2 == 0) {
                val temp = nums[start]
                nums[start] = nums[end]
                nums[end] = temp
                
                start++
                end--
            }
            
            if (nums[start] % 2 == 0) {
                start++
            }
            
            if (nums[end] % 2 != 0) {
                end--
            }
        }
        
        return nums
    }
}
