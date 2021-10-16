class Solution {
    fun lengthOfLastWord(s: String): Int {
        var end = s.length -1
        while (s[end] == ' ') end--
        
        var endTwo = end -1
        while (endTwo >= 0 && s[endTwo] != ' ' ) endTwo--

        return end - endTwo
    }
}
