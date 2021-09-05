class Solution(nums: IntArray) {
    val original = nums
    
    /** Resets the array to its original configuration and return it. */
    fun reset(): IntArray {
        return original
    }

    /** Returns a random shuffling of the array. */
    fun shuffle(): IntArray {
        return original.clone().toMutableList().shuffled().toIntArray()
    }

}

/**
 * Your Solution object will be instantiated and called as such:
 * var obj = Solution(nums)
 * var param_1 = obj.reset()
 * var param_2 = obj.shuffle()
 */
