class Solution {
    fun sumOfUnique(nums: IntArray): Int {
        var count = IntArray(101)
        
        nums.forEach {
            count[it]++
        }
        
        var sum = 0
        count.forEachIndexed { i, v ->
            if (v == 1) sum += i
        }
        
        return sum
    }
}
