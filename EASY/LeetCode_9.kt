class Solution {
    fun isPalindrome(x: Int): Boolean {
        if (x >= 0) {
            return x.toString().reversed().toLong() == x.toLong()
        }
        
        return false
    }
}
