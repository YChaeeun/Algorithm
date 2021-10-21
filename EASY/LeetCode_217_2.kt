class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val setN = HashSet<Int>()
        for (n in nums) {
            if (!setN.add(n)) return true
        }
        
        return false
    }
}
