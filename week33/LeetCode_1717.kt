class Solution {
    fun maximumGain(s: String, x: Int, y: Int): Int {
        val stackOne = arrayListOf<Char>()
        val stackTwo = arrayListOf<Char>()
        
        val points = if (x > y) Pair(x,y) else Pair(y,x)
        val check = if (x > y) Pair('b','a') else Pair('a', 'b')
        
        var max = 0
        
        s.forEach {
            if (it == check.first && stackOne.isNotEmpty() && stackOne[stackOne.size-1] == check.second) {
                stackOne.removeAt(stackOne.size-1)
                max += points.first
            } else {
                stackOne.add(it)
            }
        }
        
        stackOne.forEach {
            if (it == check.second && stackTwo.isNotEmpty() && stackTwo[stackTwo.size-1] == check.first) {
                stackTwo.removeAt(stackTwo.size-1)
                max += points.second
            } else {
                stackTwo.add(it)
            }
        }
        
        return max
    }
}
