class Solution {
    fun restoreArray(adjacentPairs: Array<IntArray>): IntArray {
        val map = HashMap<Int, MutableList<Int>>()
        val visited = HashSet<Int>()
        val answer = mutableListOf<Int>()
        
        adjacentPairs.forEach {
            map[it[0]] = map.getOrDefault(it[0], mutableListOf<Int>()).apply { add(it[1]) }
            map[it[1]] = map.getOrDefault(it[1], mutableListOf<Int>()).apply { add(it[0]) }
        }
        
        val startPoint = map.filter { it.value.size == 1 }.keys.first()
        
        dfs(answer, visited, map, startPoint)
        
        return answer.toIntArray()
    }
    
    fun dfs(answer: MutableList<Int>, visited: HashSet<Int>, map: HashMap<Int,MutableList<Int>>, value: Int) {
        if (visited.contains(value)) return // mutableList 에서 contains 체크를 하면 느려
        
        visited.add(value)
        answer.add(value)
        
        map[value]?.forEach {
            dfs(answer, visited, map, it)
        }
    }
}
