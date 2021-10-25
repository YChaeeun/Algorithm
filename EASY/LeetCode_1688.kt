class Solution {
    fun numberOfMatches(n: Int): Int {
        var num = n
        var count = 0
        
        while (num > 1) {
            if (num % 2 == 0) {
                num /= 2
                count += num
            } else {
                num = (num - 1) / 2 + 1
                count += (num - 1)
            }
        }
        
        return count
    }
}
