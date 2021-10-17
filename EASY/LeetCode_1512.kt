class Solution {
    fun numIdenticalPairs(nums: IntArray): Int {
        val map = HashMap<Int,Int>()
        
        nums.forEach { map[it] = map.getOrDefault(it,0) + 1 }
        
        var pairs = 0
        map.values.forEach { pairs += numOfPairs(it) }

        return pairs
    }
    
    fun numOfPairs(n: Int) = (n*(n-1)) / 2
}
