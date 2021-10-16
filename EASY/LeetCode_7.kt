class Solution {
    fun reverse(x: Int): Int {
        return if (x >= 0) {
            try {
                x.toString().reversed().toInt() 
            } catch (exception: NumberFormatException) {
                0
            }
        }
        else {
        try {
                x.toString().reversed().dropLast(1).toInt() * -1
            } catch (exception: NumberFormatException) {
            0
        }
            
        }
    }
}
