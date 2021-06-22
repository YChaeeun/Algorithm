class Solution {
    fun findDuplicate(paths: Array<String>): List<List<String>> {
       
        val fileToPath = HashMap<String,MutableList<String>>()
        
        for (p in paths) {
            val a = p.split(" ", "(")
            
            val root = a.first() + "/"
            
            for (i in 1 until a.size-1 step 2) {

                val file = a[i+1].dropLast(1)
                val path = root+a[i]
                
                if (!fileToPath.containsKey(file)) {
                    fileToPath[file] = mutableListOf(path)
                } else {
                    val data = fileToPath[file] as MutableList<String>
                    
                    data.add(path)
                    
                    fileToPath[file] = data
                }
            }    
        }
        
        val answer = mutableListOf<List<String>>()
        
        fileToPath.values.forEach { value ->
            if (value.size > 1) answer.add(value)
        }
        
        return answer
    }
}
