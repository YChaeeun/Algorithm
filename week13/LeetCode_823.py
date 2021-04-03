class Solution:
    def numFactoredBinaryTrees(self, arr: List[int]) -> int:
        dp = {}
        arr.sort()
        
        for i in arr :
            dp[i] = 1
            for j in arr :
                if i == j :
                    continue
                
                if (i%j == 0) and (k:=i//j) in dp :
                    dp[i] += dp[j] * dp[k]
                    
        return sum(dp.values()) % (10**9 + 7)
