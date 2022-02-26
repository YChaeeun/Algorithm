class Solution {
    fun findFinalValue(nums: IntArray, original: Int): Int {
        var searchNum = original
        
        nums.sorted().forEach {
            if (it == searchNum) searchNum *= 2
        }
        
        return searchNum
    }
}
