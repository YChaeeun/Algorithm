class Solution {
    fun numDifferentIntegers(word: String): Int {        
        val numSet = HashSet<String>()
        
        var temp = ""
        
        word.forEach {
            if (isAlpha(it)) {
                if (temp.isNotEmpty()) {
                    numSet.add(removeLeadingZeroIfNeeded(temp))
                    temp = ""
                }
            } else {
                temp += it
            }
        }
        
        
        if (temp.isNotEmpty()) {
            numSet.add(removeLeadingZeroIfNeeded(temp))
        }

        return numSet.size
    }
    
    fun isAlpha(char: Char) = char in 'a'..'z' || char in 'A'..'Z'  
    
    fun removeLeadingZeroIfNeeded(num: String): String {
        if (num.length == 1 || (num.length > 1 && num[0] != '0')) return num
        
        var position = 0
        while(position < num.length-1 && num[position] == '0') {
            position++
        }
    
        return num.substring(position)
    }
}
