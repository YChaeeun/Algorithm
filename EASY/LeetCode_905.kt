class Solution {
    fun sortArrayByParity(nums: IntArray): IntArray {
        if (nums.size == 1) return nums
        
        val even = mutableListOf<Int>()
        val odd = mutableListOf<Int>()
        
        nums.forEach {
            if (it % 2 == 0) even.add(it)
            else odd.add(it)
        }
        
        odd.forEach {
            even.add(it)
        }
        
        return even.toIntArray()   
    }
}
