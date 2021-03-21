class Solution:
    def findErrorNums(self, nums: List[int]) -> List[int]:
        sumOfN = (len(nums) * (len(nums)+1)) // 2
        
        missing =  sumOfN - sum(set(nums))
        duplicate = sum(nums) + missing - sumOfN
        
        return [duplicate, missing]
