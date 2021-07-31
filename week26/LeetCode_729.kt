// too slow


class MyCalendar() {
    // start, end
    val map = HashMap<Int, Int>()

    fun book(start: Int, end: Int): Boolean {
        val ends = map.values

        if (ends.all { it <= start }) { // 기존의 모든 end 값이 현재 start 보다 작으면 겹칠 일 없음
            map[start] = end
            return true
        }

        val starts = ends.filter { it > start }.map { map[it] } // 기존 end 값 >중에 현재 start 보다 작은 경우의 start 값 리스트

        if (starts.any { it != null && it <= start}) { // 기존 start <= 현재 start < 기존 end 인 경우
            return false
        }

        if (starts.all { it != null && end <= it}) { // 현재 end <= 기존 start >겹칠일 없음
            map[start] = end
            return true
        }
        
        return false
    }
    
}
