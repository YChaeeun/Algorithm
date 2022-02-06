class Solution {
    fun threeConsecutiveOdds(arr: IntArray): Boolean {
        for (i in 2 until arr.size) {
            if (arr[i-2] % 2 != 0 && arr[i-1] % 2 != 0 && arr[i] % 2 != 0) return true
        }
        
        return false
    }
}
