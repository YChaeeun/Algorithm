class Solution {
    fun checkIfPangram(sentence: String): Boolean {
        if (sentence.length < 26) return false
        
        val set = HashSet<Char>()
        
        sentence.forEach { set.add(it) }
        
        return set.size == 26
    }
}
