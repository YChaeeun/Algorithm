class Solution {
    fun lengthOfLastWord(s: String): Int {
        val split = s.trim().split(" ")
        return split[split.size-1].length
    }
}
