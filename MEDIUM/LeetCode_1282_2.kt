class Solution {
    fun groupThePeople(groupSizes: IntArray): List<List<Int>> {
        val answer = mutableListOf<List<Int>>()
        val map = mutableMapOf<Int, MutableList<Int>>()
        
        groupSizes.forEachIndexed { index, size ->
            val group = map.getOrPut(size) {
                mutableListOf<Int>()
            }
    
            group.add(index)
            
            if (group.size == size) {
                answer.add(group)
                map[size] = mutableListOf()
            }
        }
        
        return answer
    }
}
