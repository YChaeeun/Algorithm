class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        val sSort = s.toCharArray().apply { sort() }
        val tSort = t.toCharArray().apply { sort() }

        return sSort.joinToString("") == tSort.joinToString("")
    }
}
