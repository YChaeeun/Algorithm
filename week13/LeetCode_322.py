class Solution:
    def coinChange(self, coins: List[int], amount: int) -> int:
        # minCoins : list of minimum # of coin combination to get amount(index value of list minCoins)
        # minCoint[amount] = minimum # of coin combination
        minCoins = [float('inf') for _ in range(amount+1)]
        minCoins[0] = 0
        
        for coin in coins :
            for amount, minCoin in enumerate(minCoins) :
                if coin <= amount :
                    minCoins[amount] = min(minCoin, minCoins[amount-coin]+1)
                    
                 # ex) coin = 2, amount = 3   
                    # minCoins[3] = min(minCoins[3], minCoins[1]+1)
                        # minCoins[3] : minimum # of coins for amount 3
                        # minCoins[1] + 1 : minimum # of coins for amout 1 + one coin of coin 2
        
        return minCoins[amount] if (minCoins[amount] != float('inf')) else -1
