class Solution {
    fun findingUsersActiveMinutes(logs: Array<IntArray>, k: Int): IntArray {
        val answer = IntArray(k)
        val userActiveMinutes = HashMap<Int, MutableSet<Int>>()
        
        logs.forEach { log ->
            val minutes = userActiveMinutes.getOrDefault(log[0], mutableSetOf<Int>()).apply { add(log[1]) }
            userActiveMinutes[log[0]] = minutes
        }
        
        userActiveMinutes.values.forEach {
            answer[it.size-1]++
        }
        
        return answer
    }
}
