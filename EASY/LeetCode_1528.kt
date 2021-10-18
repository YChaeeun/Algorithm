class Solution {
    fun restoreString(s: String, indices: IntArray): String {
        val string = CharArray(s.length)
        
        s.forEachIndexed { i, v ->
            string[indices[i]] = v
        }
        
        return string.joinToString("")
    }
}
