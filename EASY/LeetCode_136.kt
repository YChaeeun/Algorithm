class Solution {
    fun singleNumber(nums: IntArray): Int {
        var num = 0
        
        nums.forEach {
            num = num xor it
        }
        
        return num
        
    }
}
