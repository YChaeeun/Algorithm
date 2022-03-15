class Solution {
    fun nearestValidPoint(x: Int, y: Int, points: Array<IntArray>): Int {
        var smallest = Integer.MAX_VALUE
        var smallestIndex = -1
        
        points.forEachIndexed { i, v ->
            if (v[0] == x || v[1] == y) {
                val absValue = abs(v[0],x, v[1], y) 
                if(absValue < smallest) {
                    smallest = absValue
                    smallestIndex = i
                }
            }
        }
    
        return smallestIndex
    }
    
    fun abs(x1: Int, x2: Int, y1: Int, y2: Int) = abs(x1, x2) + abs(y1, y2)
    
    fun abs(a: Int, b: Int): Int {
        return if (a < b) b - a else a - b
    }
}
