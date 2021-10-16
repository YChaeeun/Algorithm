class Solution {
    fun isValid(s: String): Boolean {

        val stack = ArrayList<Char>()
        val parentheses = HashMap<Char,Char>().apply {
            put(')', '(')
            put('}','{')
            put(']', '[')
        }
        
        
        s.forEach {
            when(it) {
                '(', '{', '[' -> stack.add(it)
                ')', '}', ']' -> {
                    if (stack.isEmpty()) return false
                    
                    val pop = stack.removeAt(stack.size -1)
                    if (pop != parentheses[it]) return false
                }
            }
        }
        
        return stack.isEmpty()
    }
}
