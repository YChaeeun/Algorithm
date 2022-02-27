class Solution {
    fun heightChecker(heights: IntArray): Int {
        val count = IntArray(101)
        var missmatch = 0
        
        heights.forEach { count[it]++ }
                
        for (i in 1..100) {
            count[i] += count[i-1]
        }
        
        heights.forEachIndexed { i, v ->
            if (v != heights[--count[v]]) missmatch++
        }
        
        return missmatch
    }
}
