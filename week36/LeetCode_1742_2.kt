class Solution {
    fun countBalls(lowLimit: Int, highLimit: Int): Int {
        val count = IntArray(100)
        var max = 0
        
        for (i in lowLimit..highLimit) {
            max = maxOf(max, ++count[getSumOfDigits(i)])
        }
        
        return max
    } 
    
    fun getSumOfDigits(num: Int): Int{
        var left = num
        var result = 0
        while (left > 0) {
            result += left % 10
            left /= 10
        }
        
        return result
    }
}
