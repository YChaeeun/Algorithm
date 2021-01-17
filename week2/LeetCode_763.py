
# LeetCode
# https://leetcode.com/problems/partition-labels/

class Solution:
    def partitionLabels(self, S: str) -> List[int]:
        
        start = 1000
        end = -1
        
        answer = []
        check = set()
        
        for c in S :
            if c in check : continue
            check.add(c)
            
            cStartIndex = S.find(c)
            cEndIndex = S.rfind(c)
            
            if (end >= 0 and end < cStartIndex) :
                answer.append(end - start +1)
                
                start = 1000
                end = -1
            
            if (cStartIndex < start) :
                start = cStartIndex
            if (cEndIndex > end) :
                end = cEndIndex
        
        answer.append(end - start +1)
        
        return answer
