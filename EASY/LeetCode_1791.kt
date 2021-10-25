class Solution {
    fun findCenter(edges: Array<IntArray>): Int {
        val map = HashMap<Int,Int>()
        
        edges.forEach {
            map[it[0]] = map.getOrDefault(it[0], 0) + 1
            map[it[1]] = map.getOrDefault(it[1], 0) + 1
        }
        
        return map.filterValues { it == edges.size }.run { keys.first() }
    }
}
