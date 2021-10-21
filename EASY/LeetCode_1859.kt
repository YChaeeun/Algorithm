class Solution {
    fun sortSentence(s: String): String {
        return s.split(" ").sortedBy{ it[it.length-1]}.map{ it.dropLast(1) }.joinToString(" ")
    }
}
