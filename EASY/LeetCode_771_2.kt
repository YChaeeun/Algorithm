class Solution {
    fun numJewelsInStones(jewels: String, stones: String): Int {
       return stones.count{ it in jewels }
	//  return stones.filter{ it in jewels }.length
    }
}
