class Solution {
    fun maxIncreaseKeepingSkyline(grid: Array<IntArray>): Int {
        var sum = 0
        val maxX = IntArray(grid.size)
        val maxY = IntArray(grid.size)
        
        // get maxX maxY
        for(i in grid.indices) {
            maxX[i] = grid[i].max() ?: 0
            
            for (j in grid.indices) {
                if(maxY[j] < grid[i][j]) {
                    maxY[j] = grid[i][j]
                }
            }
        }
    
        // get sum 
        for(i in grid.indices) {
            for(j in grid.indices) {
                val minMax = Math.min(maxX[i], maxY[j])
                
                if(grid[i][j] < minMax) {
                    sum += minMax - grid[i][j]
                }
            }
        }
        
        return sum
    }
}
