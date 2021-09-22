class Solution {
    fun findMaxConsecutiveOnes(nums: IntArray): Int {
        var count = 0
        var max = 0
        
        nums.forEach {
            if (it == 0) {
                if (max < count) {
                    max = count
                }
                count = 0
            }
            else count++
        }
        
        return if (max < count) count else max
    }
}
