class Solution {
    fun minMovesToSeat(seats: IntArray, students: IntArray): Int {
        var minMoves = 0
        
        seats.sort()
        students.sort()
        
        for (i in seats.indices) {
            val moves = seats[i] - students[i]
            minMoves += if (moves > 0) moves else moves*(-1)
        }
        
        return minMoves
        
    }
}
