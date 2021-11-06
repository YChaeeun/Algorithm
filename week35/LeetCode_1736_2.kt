class Solution {
    fun maximumTime(time: String): String {
        val s = StringBuilder()
        
        if (time[0] == '?') {
            if (time[1] != '?' && time[1] > '3') s.append('1')
            else s.append('2')
        } else s.append(time[0])
        
        if (time[1] == '?') {
            if (time[0] == '?' || time[0] == '2') s.append('3')
            else s.append('9')
        } else s.append(time[1])
        
        s.append(time[2])
        
        if (time[3] == '?') {
            s.append('5')
        } else s.append(time[3])
        
        if (time[4] == '?') {
            s.append('9')
        } else s.append(time[4])
        
        
        return s.toString()
    }
}
