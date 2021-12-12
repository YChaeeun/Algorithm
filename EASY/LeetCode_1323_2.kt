class Solution {
    fun maximum69Number (num: Int): Int {
        val size = Math.log10(num.toDouble()).toInt() // size should be Integer
        var divider = Math.pow(10.0, size.toDouble()).toInt()
        var result = num
        
        while (result != 0) {
            val digit = result / divider
            if (digit == 6) break
            
            result %= divider
            divider /= 10
        }
        
        return if (result == 0) num else num + divider * 3
    }
}
