class Solution {
    fun uniqueOccurrences(arr: IntArray): Boolean {
        val map = HashMap<Int, Int>()
        
        arr.forEach {
            map[it] = map.getOrDefault(it, 0) + 1
        }
        
        for ((k,v) in map) {
            val temp = v
            map[k] = 0
            if (map.containsValue(temp)) return false
        }
        
        return true
    }
}
