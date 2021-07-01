// too slow~~~~~~

class Solution {
    fun maximumUniqueSubarray(nums: IntArray): Int {
        var numAcc = nums.toMutableList()
        for (i in 1 until numAcc.size) {
            numAcc[i] += numAcc[i-1]   
        }
        
        val visited = HashMap<Int, Int>() // value, index
        var m = 0
        var startIdx = 0
        
        for (i in 0 until nums.size) {
            if (visited.containsKey(nums[i]) && visited[nums[i]]!! >= startIdx) { // 있으면
                if (startIdx == 0) {
                    m = numAcc[i-1]
                } else {
                    val new = numAcc[i-1] - numAcc[startIdx-1]
        
                    if (new > m) {
                        m = new
                    }
                }
                
                startIdx = visited[nums[i]]!!.plus(1)
            } 
            
            visited[nums[i]] = i
        }
        
        if (startIdx == 0) {
            m = numAcc[numAcc.size-1]
        } else {
             val new2 = numAcc[numAcc.size-1] - numAcc[startIdx-1]
                    
            if (new2 > m) {
                m = new2
            }
        }
        
        return m
    }
}
