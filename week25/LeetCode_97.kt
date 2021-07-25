class Solution {
    fun isInterleave(s1: String, s2: String, s3: String): Boolean {

        if (s1.length + s2.length != s3.length) return false
        
        val dp = Array(s2.length+1) { IntArray(s1.length+1) }
        
        // init row
        for (i in 1 until dp[0].size) {
            if (s1[i-1] == s3[i-1]) {
                dp[0][i] = dp[0][i-1] + 1
            }
        }
        
        // init col
        for (i in 1 until dp.size) {
            if (s2[i-1] == s3[i-1]) {
                dp[i][0] = dp[i-1][0] + 1
            }
        }
        
        for(i in 1 until dp.size) {
            for (j in 1 until dp[0].size) {
   
                if (dp[i][j-1] == 0 && dp[i-1][j] == 0) {
                    dp[i][j] = 0                   
                } else {
                   var max = 0
                   
                   if (dp[i-1][j] != 0 && s3[dp[i-1][j]] == s2[i-1]) {
                       max = dp[i-1][j] + 1
                   }
                   
                   if (dp[i][j-1] != 0 && s3[dp[i][j-1]] == s1[j-1]) {
                       if (dp[i][j-1] + 1 > max) max = dp[i][j-1] + 1
                   }
                   
                   dp[i][j] = max
                }
            }
        }

        return dp[s2.length][s1.length] == s3.length
    }
}
