class Solution {
    fun longestConsecutive(nums: IntArray): Int {
        
        if (nums.isEmpty()) return 0
        
        val sortedNums = nums.toSortedSet().toIntArray()
        
        var length = 1
        var maxL = 0
        
        for(i in 0 until sortedNums.size-1) {        
            if (sortedNums[i]+1 == sortedNums[i+1]) {
                length += 1
            } else {
                if (length > maxL) maxL = length
                
                length = 1
            }
        }
        
        if (length > maxL) maxL = length
    
        return maxL
    }
}
