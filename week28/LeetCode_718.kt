class Solution {
    fun findLength(nums1: IntArray, nums2: IntArray): Int {
        
        val dp = Array(nums1.size) { IntArray(nums2.size)}
        var max = 0
        
        for (i in nums1.indices) {
            for (j in nums2.indices) {
                if (nums1[i] == nums2[j]) {
                    if (i-1 >= 0 && j-1 >= 0) {
                        dp[i][j] += (dp[i-1][j-1] +1 )
                    } else {
                        dp[i][j] = 1
                    }
                    
                    if (dp[i][j] > max) {
                        max = dp[i][j]
                    }
                }
            }
        }
        
        return max
        
    }
}
