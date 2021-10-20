class Solution {
    fun interpret(command: String): String {
        var answer = ""
        
        command.forEachIndexed { i, c ->
            when(c) {
                'G' -> answer += c
                ')' -> answer += if (command[i-1] == '(') 'o' else "al"
            }   
        }
        
        return answer
    }
}
