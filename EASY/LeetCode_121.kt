class Solution {
    fun maxProfit(prices: IntArray): Int {
        var smallest = Integer.MAX_VALUE
        var maxProfit = 0
        
        prices.forEach {
            if (it < smallest) {
                smallest = it
            }
            
            var profit = it - smallest
            if (profit > maxProfit) {
                maxProfit = profit
            }
        }
        
        
        return maxProfit
    }
}
