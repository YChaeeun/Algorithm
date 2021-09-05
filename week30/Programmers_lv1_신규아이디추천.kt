// https://programmers.co.kr/learn/courses/30/lessons/72410
// level 1

class Solution {
    fun solution(new_id: String): String {

        var dotFlag = false
        
        var id = new_id.toLowerCase() // step 1
        
        var recommend = ""
        
        id.forEachIndexed { i, v -> // step 2, step 3
            if (v.isLetterOrDigit() || "-_".contains(v)) {
                if (dotFlag == true) {
                    recommend += '.'
                    dotFlag = false
                }
                
                recommend += v
            } else if (v == '.') {    
                dotFlag = true
            } 
        }

      // step 4
        recommend = recommend.removePrefix(".")
        recommend = recommend.removeSuffix(".")

        // step 5
        if (recommend.isEmpty()) {
            recommend = "a"
        }

        // step 6
        if (recommend.length > 15) {
            recommend = recommend.substring(0,15)
            
            recommend = recommend.removePrefix(".")
            recommend = recommend.removeSuffix(".")
        }
        
        // step 7
        val size = recommend.length
        if (size < 3) {
            for (i in 0 until 3-size) {
                recommend += recommend[size-1]
            }
        }

        return recommend
    }
}
