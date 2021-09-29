// improved time complexity

class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {  
        val map = HashMap<Int, Int>()
        
        for (i in 0 until nums.size) {
            if (map.containsKey(target-nums[i])) {
                return intArrayOf(i, map[target-nums[i]] ?: 0)
            }
            
            map[nums[i]] = i
        }
 
        return intArrayOf()
    }
}
