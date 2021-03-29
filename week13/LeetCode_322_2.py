class Solution:
    def coinChange(self, coins: List[int], amount: int) -> int:
        minCoins = [float('inf')] * (amount+1)
        minCoins[0] = 0
        
        for coin in coins :
            for amount in range(coin,amount+1) :
                minCoins[amount] = min(minCoins[amount], minCoins[amount-coin]+1)
        
        return minCoins[amount] if (minCoins[amount] != float('inf')) else -1
