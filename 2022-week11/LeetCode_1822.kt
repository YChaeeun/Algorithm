class Solution {
    fun arraySign(nums: IntArray): Int {
        var countMinus = 0
        
        for (n in nums) {
            if (n == 0) return 0
            if (n < 0) countMinus++
        }
        
        return if (countMinus%2 == 0) 1 else -1
    }
}
