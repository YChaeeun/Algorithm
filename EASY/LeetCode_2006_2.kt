class Solution {
    fun countKDifference(nums: IntArray, k: Int): Int {
        val map = hashMapOf<Int,Int>()
        var count = 0
        
        nums.forEach {
            if (map.containsKey(it+k)) count += map.getOrDefault(it+k,0)
            if (map.containsKey(it-k)) count += map.getOrDefault(it-k,0)
            
            map[it] = map.getOrDefault(it,0) + 1
        }

        return count
    }
}
