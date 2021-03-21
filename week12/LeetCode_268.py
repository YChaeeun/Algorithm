class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        sumOfN = (len(nums) * (len(nums)+1)) // 2
        return sumOfN - sum(nums)
