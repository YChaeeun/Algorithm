class Solution {
    fun shuffle(nums: IntArray, n: Int): IntArray {
        val answer = IntArray(n*2)
        var j = 0
        
        for (i in 0 until n) {
            answer[j++] = nums[i]
            answer[j++] = nums[i+n]
        }
        
        return answer
    }
}
