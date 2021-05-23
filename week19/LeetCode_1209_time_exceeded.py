class Solution:
    def removeDuplicates(self, s: str, k: int) -> str:
        result = ""
        
        count = 1
        
        begin = 0
        end = 0
        for i in range(len(s)-1) :
            if s[i] == s[i+1] :
                count += 1
                end = i+1
            else :
                begin = i+1
                count = 1
                
            if count == k :
                result += "".join((s[:begin], s[end+1:]))
                break
                
        if result == "" :
            return s
        else :
            return self.removeDuplicates(result, k)
