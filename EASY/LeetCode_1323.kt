class Solution {
    fun maximum69Number (num: Int): Int {
        val answer = StringBuilder()
        var isFirstChange = true
        
        num.toString().forEach {
            if (it == '6' && isFirstChange)  {
                answer.append('9')
                isFirstChange = false
            }
            else answer.append(it)
        }
        
        return answer.toString().toInt()
    }
}
