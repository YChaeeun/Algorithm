class Solution {
    fun countPairs(deliciousness: IntArray): Int {
        val NUM = 1_000_000_007
        
        val map = hashMapOf<Int, Int>()
        var count = 0
        
        for (d in deliciousness) {
            var power = 1
            for (p in 0..21) {
                if (map.containsKey(power-d)) {
                    count += map.getOrDefault(power-d,0)
                    count %= NUM
                }
                power *= 2
            }
            
            map[d] = map.getOrDefault(d,0) + 1
        }
        
        return count
    }
}
