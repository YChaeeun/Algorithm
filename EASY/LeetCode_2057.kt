class Solution {
    fun smallestEqual(nums: IntArray): Int {        
        nums.forEachIndexed { i, v ->
            if (i % 10 == v) {
                return i
            }
        }
        
        return -1
        
    }
}
