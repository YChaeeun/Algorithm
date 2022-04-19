class Solution {
    fun squareIsWhite(coordinates: String): Boolean {
        val isSquareStartsWithWhite = (coordinates[0]-'0') % 2 == 0
        val num = Character.getNumericValue(coordinates[1])
        
        return if (isSquareStartsWithWhite) num % 2 != 0 else num % 2 == 0
    }
}
