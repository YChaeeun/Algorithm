class Solution {
    fun shuffle(nums: IntArray, n: Int): IntArray {
        val answer = IntArray(n*2)
        var j = 0
        
        for (i in 0 until nums.size step 2) {
            answer[i] = nums[j]
            answer[i+1] = nums[j+n]
            
            j++
        }
        
        return answer
    }
}
