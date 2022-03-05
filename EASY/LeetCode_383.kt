class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val ransomNoteSort = ransomNote.toCharArray().apply { sort() }
        val magazineSort = magazine.toCharArray().apply { sort() }
        
        var i = 0
        var j = 0
        while (i < ransomNoteSort.size && j < magazineSort.size) {
            if (ransomNoteSort[i] == magazineSort[j]) {
                i++
            }
            
            j++
        }
        
        return i == ransomNoteSort.size
    }
}
