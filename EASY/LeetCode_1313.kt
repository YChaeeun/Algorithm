class Solution {
    fun decompressRLElist(nums: IntArray): IntArray {
        var answer = arrayListOf<Int>()
        
        for (i in 0 until nums.size step 2) {
            for (j in 0 until nums[i]) {
                answer.add(nums[i+1])
            }
        }
        
        return answer.toIntArray()
    }
}
