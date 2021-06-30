class Solution {
    fun minPartitions(n: String): Int {
        // 82734
        // 11111 (71623)
        // 11111 (60512)
        // 10111 (50401)
        // 10101 (40300)
        // 10100 (30200)
        // 10100 (20100)
        // 10100 (10000)
        // 10000 (00000)
        
        var max = '0'
        n.forEach { if(it > max) max = it }
        
        return Character.getNumericValue(max)
    }
}
