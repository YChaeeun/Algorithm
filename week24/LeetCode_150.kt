class Solution {
    fun evalRPN(tokens: Array<String>): Int {
        val stack = mutableListOf<Int>()
        
        for(t in tokens) {
            if (t.isDigit()) stack.add(t.toInt())
            else {
                val op2 = stack.pop()
                val op1 = stack.pop()

                stack.add(calculate(op1, op2, t))
            }
        }
        
        return stack.first()
    }
    
    fun String.isDigit() : Boolean {
        for (s in this) {
            if (this.length > 1 && s == '-') return true
            
            if (!s.isDigit()) return false
        }
        
        return true
    }
    
    fun MutableList<Int>.pop() : Int {
        val item = this.lastOrNull()
        if (!isEmpty()){
            this.removeAt(this.size -1)
        }
        return item ?: 0
    }
    
    fun calculate(op1 : Int, op2: Int, oper: String) = when(oper) {
            "+" -> op1 + op2
            "-" -> op1 - op2
            "*" -> op1 * op2
            "/" -> op1 / op2
            else -> 0
        }
}
