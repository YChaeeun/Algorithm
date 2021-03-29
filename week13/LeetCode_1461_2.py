class Solution:
    def hasAllCodes(self, s: str, k: int) -> bool:
        lenS = len(s)
        
        # minimun length 
        if lenS < 2**k + k - 1 :
            return False
        
        subStringSet = set()
        remaining = 2**k
        
        i = 0
        while i < lenS-k+1 : 
            if s[i:i+k] not in subStringSet :
                subStringSet.add(s[i:i+k])
                remaining -= 1
            
            if remaining <= 0 :
                return True
        
            i += 1
        
        return False
