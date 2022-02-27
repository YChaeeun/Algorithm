class Solution {
    fun freqAlphabets(s: String): String {
        val sb = StringBuilder()
    
        var shapFlag = 0
        var temp = ""
        
        s.reversed().forEach { 
            when {
                shapFlag > 0 -> {
                    temp += it
                    shapFlag--
                    
                    if (shapFlag == 0 && temp.isNotEmpty()) {
                        sb.appendNum(temp.reversed().toInt())
                        temp = ""
                    }
                }
                it == '#' -> {
                    shapFlag = 2
                    temp = ""
                }
                else ->  sb.appendNum(Character.getNumericValue(it))
            }
        }
        
        return sb.toString().reversed()
    }
    
    fun StringBuilder.appendNum(num: Int) {
        val numToChar = 'a' + (num -1)
        append(numToChar)
    }
}
