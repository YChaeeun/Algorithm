class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val setN = mutableSetOf<Int>()
        for (n in nums) {
            if (setN.contains(n)) return true
            
            setN.add(n)
        }
        
        return false
    }
}
