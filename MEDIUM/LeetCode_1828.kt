class Solution {
    fun countPoints(points: Array<IntArray>, queries: Array<IntArray>): IntArray {
        val counts = IntArray(queries.size)
        
        queries.forEachIndexed { i, query ->
            for (point in points) {
                if (isPointInCircle(query, point)) {
                    counts[i]++
                }  
            }
        }
        
        return counts
    }
    
    fun isPointInCircle(query: IntArray, point: IntArray): Boolean {
        // a^2 + b^2 = c^2
        val a = point[0] - query[0]
        val b = point[1] - query[1]
        val c = query[2]
        
        if (a*a + b*b <= c*c) {
            return true
        }
        
        return false
    }
}
