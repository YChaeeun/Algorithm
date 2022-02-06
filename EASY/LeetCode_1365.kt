class Solution {
    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
        val answer = IntArray(nums.size)
        
        for (i in nums.indices) {
            for (j in nums.indices) {
                if (nums[i] > nums[j]) answer[i]++
            }
        }
        
        return answer
    }
}
