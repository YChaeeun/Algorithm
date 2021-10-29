class Solution {
    fun uniqueMorseRepresentations(words: Array<String>): Int {
        val alpha = listOf(".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..")
        
        val stringSet = mutableSetOf<String>()
        
        words.forEach {
            var string = ""
            it.forEach { s ->
                string += alpha[s - 'a']
            }
            stringSet.add(string)
        }
        
        return stringSet.size
    }
}
