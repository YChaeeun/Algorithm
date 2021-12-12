class Solution {
    fun uniqueOccurrences(arr: IntArray): Boolean {
        val map = HashMap<Int, Int>()
        
        arr.forEach {
            map[it] = map.getOrDefault(it, 0) + 1
        }
        
        return map.values.toSet().size == map.values.size
    }
}
