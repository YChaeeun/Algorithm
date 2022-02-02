class Solution {
    fun maxIncreaseKeepingSkyline(grid: Array<IntArray>): Int {
        var sum = 0
        val maxX = IntArray(grid.size)
        val maxY = IntArray(grid.size)

        for(i in grid.indices) {            
            for (j in grid.indices) {
                if(maxX[i] < grid[i][j]) {
                    maxX[i] = grid[i][j]
                }
                
                if(maxY[j] < grid[i][j]) {
                    maxY[j] = grid[i][j]
                }
            }
        }
    
        for(i in grid.indices) {
            for(j in grid.indices) {
                sum += Math.min(maxX[i], maxY[j]) - grid[i][j]
            }
        }
        
        return sum
    }
}
