class Solution {
    fun minMoves2(nums: IntArray): Int {
        nums.sort()
        
	// not mean
        val median = nums[nums.size/2]
        var count = 0
        
        nums.forEach { n ->
            count += (if (median >= n) median - n else n - median)
        }
        
        return count
    }
}
