class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""
        
        val sorted = strs.sortedBy{ -it.length }
        
        val string = sorted[0]
        var prefixIdx = string.length
        
        for (i in 1 until sorted.size) {
            var count = 0
            inner@ for (j in sorted[i].indices) {
                when {
                    sorted[i][j] == string[j] -> count += 1
                    count < 1 -> return ""
                    else -> break@inner
                }
            }
            
            if (count < prefixIdx) {
                prefixIdx = count       
            }
        }
        
        return string.take(prefixIdx)
    }
}
