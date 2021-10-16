class Solution {
    fun getConcatenation(nums: IntArray): IntArray {
        val size = nums.size
        val answer = IntArray(size * 2)
        
        for (i in nums.indices) {
            answer[i] = nums[i]
            answer[i+size] = nums[i]
        }
        
        return answer
    }
}
