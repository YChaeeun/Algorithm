class Solution {
    fun sumOfUnique(nums: IntArray): Int {
        var count = IntArray(101)
        
        var sum = 0
        nums.forEach {
            count[it]++
            
            if (count[it] == 1) {
                sum += it
            } else if (count[it] == 2) {
                sum -= it
            }
        }

        return sum
    }
}
