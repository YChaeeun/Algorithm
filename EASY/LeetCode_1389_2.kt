class Solution {
    fun createTargetArray(nums: IntArray, index: IntArray): IntArray {
        val target = mutableListOf<Int>()
        
        nums.forEachIndexed { i, n ->
            if (i == index[i]) target.add(n)
            else target.add(index[i], n)
        }
        
        return target.toIntArray()
    }
}
