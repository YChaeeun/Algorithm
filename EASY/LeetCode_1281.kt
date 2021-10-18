class Solution {
    fun subtractProductAndSum(n: Int): Int {
        val digits = mutableListOf<Int>()
        var num = n
        
        while (num > 0) {
            digits.add(num % 10)
            num = num / 10
        }
        
        return digits.reduce { s, e -> s*e} - digits.sum()
    }
}
