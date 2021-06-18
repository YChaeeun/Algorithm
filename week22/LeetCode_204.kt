class Solution {
    fun countPrimes(n: Int): Int {
        if (n < 2) return 0
        
        val array = BooleanArray(n){true}
        
        var num = 2
        while (num*num < n) {
            
            when(array[num]) {
                false -> {}
                true -> {
                    for (k in num*2..n-1 step num) {
                        array[k] = false
                     }  
                }
            }
        
            num++
        }
    
        return array.filter{it == true}.count() - 2
    }
}
