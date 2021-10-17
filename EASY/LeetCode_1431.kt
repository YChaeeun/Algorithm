class Solution {
    fun kidsWithCandies(candies: IntArray, extraCandies: Int): List<Boolean> {
        var max = 0
        candies.forEach { if (it > max) max = it }
        
        val answer = MutableList<Boolean>(candies.size) {false}
        candies.forEachIndexed { i,v -> answer[i] = (v + extraCandies >= max) }
        
        return answer
    }
}
