class Solution {
    fun createTargetArray(nums: IntArray, index: IntArray): IntArray {
        val target = IntArray(nums.size) { -1 }
        
        for (i in nums.indices) {
            val targetIdx = index[i]
            
            if (target[targetIdx] != -1) {
                // make space for nums[i]
		for (j in nums.size-2 downTo targetIdx) {
                    target[j+1] = target[j]
                }
            }
            
            target[targetIdx] = nums[i]
        }
        
        
        return target
    }
}
