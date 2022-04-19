class Solution {
    fun replaceElements(arr: IntArray): IntArray {
        var maxValue = Integer.MIN_VALUE
        
        for (i in arr.size-2 downTo 0) {
            val temp = arr[i]
            
            arr[i] = maxOf(maxValue, arr[i+1])
            
            if (temp > maxValue) maxValue = temp
        }
        
        arr[arr.lastIndex] = -1
        
        return arr
    }
}
