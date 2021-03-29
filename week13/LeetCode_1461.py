class Solution:
    def hasAllCodes(self, s: str, k: int) -> bool:
        subStringSet = set()
        
        i = 0
        while i < len(s)-k+1 : 
            subStringSet.add(s[i:i+k])
            
            if len(subStringSet) == 2**k :
                return True
        
            i += 1
        
        return False
