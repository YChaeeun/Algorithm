class Solution {
    fun maxArea(h: Int, w: Int, horizontalCuts: IntArray, verticalCuts: IntArray): Int {
        
        horizontalCuts.sort()
        verticalCuts.sort()
        
        // get max horizontal value
        var maxHc = maxOf(horizontalCuts[0], (h-horizontalCuts[horizontalCuts.size-1])).toLong()
    
        for (i in 1 until horizontalCuts.size) {
            val h = horizontalCuts[i] - horizontalCuts[i-1]
            
            if (maxHc < h) {
                maxHc = h.toLong()
            }
        }
        
        
        // get max vertical value
        var maxVc = maxOf(verticalCuts[0], (w-verticalCuts[verticalCuts.size-1])).toLong()
        
        for (i in 1 until verticalCuts.size) {
            val v = verticalCuts[i] - verticalCuts[i-1]
            
            if (maxVc < v) {
                maxVc = v.toLong()
            }
        }
        
        return ((maxHc * maxVc) % (1000000007)).toInt()
    }
}
