class MyHashSet() {

    /** Initialize your data structure here. */

    private val values = BooleanArray(1_000_000 + 1)

    fun add(key: Int) {
        values[key] = true
    }

    fun remove(key: Int) {
        values[key] = false
    }

    /** Returns true if this set contains the specified element */
    fun contains(key: Int): Boolean {
        return values[key]
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * var obj = MyHashSet()
 * obj.add(key)
 * obj.remove(key)
 * var param_3 = obj.contains(key)
 */
