class Solution {
    fun truncateSentence(s: String, k: Int): String {
       // return s.split(" ").filterIndexed { i,v -> i < k}.joinToString(" ")
	return s.split(" ").take(k).joinToString(" ")
    }
}
