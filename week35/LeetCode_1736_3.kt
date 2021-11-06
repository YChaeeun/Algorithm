class Solution {
    fun maximumTime(time: String): String {
         val new = time.toCharArray()

        if (new[0] == '?') 
            new[0] = if (new[1] != '?' && new[1] > '3') '1' else '2'
        
        if (new[1] == '?')
            new[1] = if (new[0] == '2') '3' else '9'

        if (new[3] == '?')
            new[3] = '5'

        if (new[4] == '?')
            new[4] = '9'

        return String(new)  
    }
}
