
# LeetCode
# https://leetcode.com/problems/count-square-submatrices-with-all-ones

class Solution:
    def countSquares(self, matrix: List[List[int]]) -> int:
        answer = 0; 
        
        for r in range(len(matrix)):
            for c in range(len(matrix[0])):
                if matrix[r][c] == 0: continue
                if r==0 or c==0: answer += 1; continue
                matrix[r][c] = min(matrix[r-1][c-1], matrix[r][c-1], matrix[r-1][c]) + 1
                answer += matrix[r][c]
        return answer
