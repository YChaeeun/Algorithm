class Solution {
    fun numJewelsInStones(jewels: String, stones: String): Int {
        var sum = 0
        
        stones.forEach {
            if (it in jewels) sum++
        }
        
        return sum
    }
}
