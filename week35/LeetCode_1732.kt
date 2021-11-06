class Solution {
    fun largestAltitude(gain: IntArray): Int {
        var heighest = 0
        var sum = 0
        
        gain.forEach {
            sum += it
            
            if (sum > heighest) heighest = sum
        }
        
        return heighest
    }
}
