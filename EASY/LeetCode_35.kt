class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var start = 0
        var end = nums.size - 1
        var mid = (start + end) / 2
        
        while (start <= end) {
           mid = (start + end) / 2
            
            when {
                nums[mid] == target -> return mid
                nums[mid] > target -> end = mid-1
                nums[mid] < target -> start = mid+1
            }
        }
        
        return start
    }
}
