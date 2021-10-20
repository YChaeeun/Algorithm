class Solution {
    fun numberOfSteps(num: Int): Int {
        var n = num
        var count = 0
        
        while (n > 0) {
            n = if (n % 2 == 0) n/2 else n-1
            count++
        }
        
        return count
    }
}
