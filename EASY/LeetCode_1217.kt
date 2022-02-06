class Solution {
    fun minCostToMoveChips(position: IntArray): Int {
        var even = 0
        var odd = 0
        
        position.forEach {
            if (it % 2 == 0) even++
            else odd++
        }
        
        return Math.min(odd, even)
    }
}
