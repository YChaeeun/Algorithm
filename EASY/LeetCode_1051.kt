class Solution {
    fun heightChecker(heights: IntArray): Int {
        val expected = heights.sorted()
        var missmatch = 0
    
        expected.forEachIndexed {i, v ->
            if (v != heights[i]) missmatch++
        }
        
        return missmatch
    }
}
