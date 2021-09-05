class Solution(nums: IntArray) {
    val original = nums
    
    /** Resets the array to its original configuration and return it. */
    fun reset(): IntArray {
        return original
    }

    /** Returns a random shuffling of the array. */
    fun shuffle(): IntArray {
        val clone = original.clone()
        
        clone.forEachIndexed { i, v ->
            val randomIndex = (i until clone.size).random() // get Random Index
            clone.swap(i, randomIndex)
        }
        
        return clone
    }
    
    private fun IntArray.swap(i1: Int, i2: Int) {
        val temp = this[i1]
        
        this[i1] = this[i2]
        this[i2] = temp
    }

}

/**
 * Your Solution object will be instantiated and called as such:
 * var obj = Solution(nums)
 * var param_1 = obj.reset()
 * var param_2 = obj.shuffle()
 */
