
# LeetCode - medium
# https://leetcode.com/problems/boats-to-save-people/

# Improvements
# 1. remove "count += 1" in while loop
# 2. use "len(people)" once (len() - O(1))

class Solution:
    def numRescueBoats(self, people: List[int], limit: int) -> int:
        people.sort()
        i= 0
        l = len(people)
        j = l - 1
    
        while i <= j:
            if people[i] + people[j] <= limit:
                i += 1
            j -= 1

        return l-j-1
