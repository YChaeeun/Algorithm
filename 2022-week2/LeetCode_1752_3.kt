class Solution {
    fun check(nums: IntArray): Boolean {
        if (nums.size < 3) return true
        
        val expected = nums + nums
        var count = 0
        
        for (i in 0 until expected.size -1) {
            if (expected[i] > expected[i+1]) {
                count = 0
            } else {
                count++
            }
            
            if (count == nums.lastIndex) return true
        }
        
        return false
    }
}
