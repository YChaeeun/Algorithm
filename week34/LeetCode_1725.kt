class Solution {
    fun countGoodRectangles(rectangles: Array<IntArray>): Int {
        
        val largest = rectangles.map {if (it[0] > it[1]) it[1] else it[0]}
        val max = largest.max()
        
        return largest.count { it == max }
    }
}
