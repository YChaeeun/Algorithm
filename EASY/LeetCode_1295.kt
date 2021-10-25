class Solution {
    fun findNumbers(nums: IntArray): Int {
        var count = 0
        
        nums.forEach {
            if (getDigits(it) % 2 == 0) count++
        }
        
        return count
    }
    
    fun getDigits(num: Int): Int {
        var n = num
        var digit = 0
        
        while (n > 0) {
            n /= 10
            digit++
        }
        
        return digit
    }
}
