class Solution {
    fun countBalls(lowLimit: Int, highLimit: Int): Int {
        val map = HashMap<Int, Int>()
        val n = highLimit - lowLimit + 1
        
        for (i in 0 until n) {
            val sum = getSumOfDigits(lowLimit + i)
            map[sum] = map.getOrDefault(sum, 0) + 1
        }
        
        return map.values.max() ?: 0
    }
    
    fun getSumOfDigits(num: Int): Int{
        var left = num
        var result = 0
        
        while (left > 0) {
            result += (left % 10)
            left /= 10
        }
        
        return result
    }
}
