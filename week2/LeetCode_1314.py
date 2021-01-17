# LeetCode 1314
# https://leetcode.com/problems/matrix-block-sum/

class Solution:
    def matrixBlockSum(self, mat: List[List[int]], K: int) -> List[List[int]]:
        i = 0
        j = 0
        
        rowSize = len(mat)
        colSize = len(mat[0])
        
        answer = [[0 for x in range(colSize)] for x in range(rowSize)]

        for i in range(0,rowSize) :
            for j in range(0,colSize) :
            
                r = getRange(i,rowSize, K)
                c = getRange(j, colSize ,K)
            
                answer[i][j] = sumAll(r,c,mat)
        
        return answer
    
    
def getRange(i:int, length: int, K: int) :
        start = 0
        end = length - 1
        
        if (i-K > 0) :
            start = i-K
        
        if (i+K < length) :
            end = i+K
        
        return [int(i) for i in range(start,end+1)]
    

def sumAll(r, c, mat) :
    result = 0
    
    for i in r :
        for j in c :
            result += mat[i][j]
    
    return result
