class Solution {
    fun arrayNesting(nums: IntArray): Int {
        var max = 0
        
        nums.forEach {
            val value = dfs(nums, arrayListOf(it), it)
            
            if (max < value) max = value  
        }
        
        return max
    }
    
    fun dfs(nums: IntArray, s: ArrayList<Int>, k: Int): Int {
        
        val k = nums[k]
        
        if (s.contains(k)) {
            return s.size
        }
        
        s.add(k)
        
        return dfs(nums, s, k)
    }
}
