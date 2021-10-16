class Solution {
    fun totalMoney(n: Int): Int {
        var sum = 0
        val q = n / 7
        val r = n % 7
        
        for (i in 0 until q) {
            sum += (sumFromTo(7+i, 8+i) - sumFromTo(i, i+1))
        }
        
        if (r > 0) {
            sum += (sumFromTo(r+q, r+q+1) - sumFromTo(q, q+1))
        }
        
        return sum
    }
    
    fun sumFromTo(one:Int, two:Int) = (one * two) / 2
}
