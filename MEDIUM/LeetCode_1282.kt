class Solution {
    fun groupThePeople(groupSizes: IntArray): List<List<Int>> {
        val answer = mutableListOf<List<Int>>()
        val map = mutableMapOf<Int, MutableList<Int>>()
        
        groupSizes.forEachIndexed { i, v ->
            val value = map.getOrDefault(v, mutableListOf())
            value.add(i)
            
            map[v] = value
        }
        
        map.forEach { k, v ->
            if (v.size == k) {
                answer.add(v)
            } else {
                for(i in 0 until v.size/k) {                    
                    answer.add(v.slice((i*k) until (i*k)+k))
                }
            }
        }
        
        return answer.toList()
    }
}
