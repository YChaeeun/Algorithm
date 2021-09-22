class Solution {
    fun slowestKey(releaseTimes: IntArray, keysPressed: String): Char {
        var max = Pair(keysPressed[0], releaseTimes[0])
        
        for (i in 1 until keysPressed.length) {
            val delay = releaseTimes[i] - releaseTimes[i-1]
            
            if ((max.second < delay) || (max.second == delay && max.first < keysPressed[i])) {
                max = Pair(keysPressed[i], delay) 
            }
        }

        return max.first
    }
}
