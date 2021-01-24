
# LeetCode - easy
# https://leetcode.com/problems/merge-sorted-array/


class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        nums1[m:len(nums1)] = nums2[:]
        nums1.sort()
