class Solution {
    fun reverse(x: Int): Int {
        val result = if (x >= 0) {
            x.toString().reversed().toLong()
        } else {
            x.toString().reversed().dropLast(1).toLong() * -1
        }
        
        return if (result < Int.MIN_VALUE || result > Int.MAX_VALUE) 0 else result.toInt()
    }
}
