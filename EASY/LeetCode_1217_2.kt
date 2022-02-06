class Solution {
    fun minCostToMoveChips(position: IntArray): Int {
        val even = position.count { it and 1 == 0 }
        
        return Math.min(even, position.size - even)
    }
}
