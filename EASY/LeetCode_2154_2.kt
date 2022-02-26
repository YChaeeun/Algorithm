class Solution {
    fun findFinalValue(nums: IntArray, original: Int): Int {
        val numsSet = nums.toSet()
        var searchNum = original
        
        while(numsSet.contains(searchNum)) { // HashSet contains O(1)
            searchNum *= 2
        }
        
        return searchNum
    }
}
