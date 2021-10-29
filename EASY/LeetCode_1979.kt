class Solution {
    fun findGCD(nums: IntArray): Int {
        var min = 1001
        var max = 0
        
        nums.forEach {
            if (it > max) max = it
            if (it < min) min = it
        }
        
        for (i in min downTo 2) {            
            if (max % i == 0 && min % i == 0) return i
        }
        
        return 1
    }
}
