# subsequences : no need to be continuous...
# if s is already palindromic, return 1
# else remove all the 'a' and all the 'b' subsequences... return 2

class Solution:
    def removePalindromeSub(self, s: str) -> int:
        return 1 if s == s[::-1] else 2

