class Solution {
    fun subtractProductAndSum(n: Int): Int {
        var num = n
        
        var product = 1
        var sum = 0
        
        while (num > 0) {
            val digit = num % 10

            sum += digit
            product *= digit
           
            num = num / 10
        }
        
        return product - sum
    }
}
