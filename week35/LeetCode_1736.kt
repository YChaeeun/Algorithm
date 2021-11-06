class Solution {
    fun maximumTime(time: String): String {
        var isHour = true
        val s = StringBuilder()
        
        time.forEach {
            if (it == ':') isHour = false
            
            if (it == '?') {
                if (s.isEmpty()) {
                    s.append('2')
                } else {
                   val last = s.last() 
                   
                   when {
                       isHour && last == '2' -> s.append('3')
                       !isHour && last == ':' -> s.append('5')
                       else -> s.append('9')
                   }
                }
            } else {
                if (s.isNotEmpty() && isHour && s.last() == '2' && it > '3') {
                    s.deleteCharAt(s.length-1)
                    s.append('1')
                }
                s.append(it)
            } 
        }
        
        return s.toString()
    }
}
