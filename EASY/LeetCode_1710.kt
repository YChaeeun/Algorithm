class Solution {
    fun maximumUnits(boxTypes: Array<IntArray>, truckSize: Int): Int {
        
        var maxValue = 0
        var t = truckSize

        for (b in boxTypes.sortedByDescending { it[1] }) {
             if (t > b[0]) {
                t -= b[0]
                maxValue += (b[0] * b[1])
            } else {
                maxValue += (t * b[1])
                break
            }
        }
        
        return maxValue
    }
}
