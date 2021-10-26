class Solution {
    fun countConsistentStrings(allowed: String, words: Array<String>): Int {
        var count = words.size
        
        for (w in words) {
            for (c in w) {
                if (!allowed.contains(c)) {
                    count--
                    break
                }
            }
        }
        
        return count
    }
}
