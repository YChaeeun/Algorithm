class Solution {
    fun detectCapitalUse(word: String): Boolean {
        var isHeadCapital = word[0].isUpperCase()

        for (i in 1 until word.length) {
            if (isHeadCapital) {
                if (i > 1 && word[i-1].isUpperCase() != word[i].isUpperCase()) return false
            } else {
                if (word[i].isUpperCase()) return false
            }
        }
        
        return true
    }
}
