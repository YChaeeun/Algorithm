class Solution {
    fun findDuplicates(nums: IntArray): List<Int> {
        val result = IntArray(nums.size+1){0}
        
        nums.forEach { result[it]++ }
 
        return result.mapIndexed{i,v -> if(v > 1) i else null}.filterNotNull().toList()
    }
}
