class Solution { 
    fun firstUniqChar(s: String): Int {
        val count = HashMap<Char, Int>() // char - count
        val queue = LinkedList<Pair<Char, Int>>() // char - index
        
        s.forEachIndexed { i, v ->
            if (!count.containsKey(v)) {
                queue.add(Pair(v, i))
            }
            
            count[v] = count.getOrDefault(v, 0) + 1
        }
        
        while(queue.isNotEmpty()) {
            val char = queue.pop()
            if (count[char.first] == 1) return char.second
        }
        
        return -1
        
    }
}
