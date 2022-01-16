class Solution {
    fun maximumScore(a: Int, b: Int, c: Int): Int {
        var points = 0
        
        val pq = PriorityQueue<Int>(reverseOrder())
        pq.add(a)
        pq.add(b)
        pq.add(c)
        
        while (pq.isNotEmpty()) {
            val one = pq.poll()
            val two = pq.poll()
            
            if (one == null || two == null) break
            
            if (one-1 != 0) pq.add(one-1)
            if (two-1 != 0) pq.add(two-1)
            
            points++
        }
        
        return points
    }
}
