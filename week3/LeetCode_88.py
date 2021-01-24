
# LeetCode - easy
# https://leetcode.com/problems/merge-sorted-array/

class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        if (m == 0) : nums1[0] = nums2[0]
        
        idx1 = m-1
        idx2 = n-1
        nums1Idx = len(nums1)-1
        
        for _ in range(len(nums1)) :
            if (idx1 < 0 or idx2 < 0) : break
            
            if (nums1[idx1] <= nums2[idx2]) :
                nums1[nums1Idx] = nums2[idx2]
                idx2 -= 1
                nums1Idx -= 1
            else :
                nums1[nums1Idx] = nums1[idx1]
                idx1 -= 1
                nums1Idx -= 1
                
        while(nums1Idx >= 0) :
            if (idx1 < 0) :
                nums1[nums1Idx] = nums2[idx2]
                idx2 -= 1
                nums1Idx -= 1
            elif (idx2 < 0) :
                nums1[nums1Idx] = nums1[idx1]
                idx1 -= 1
                nums1Idx -= 1
    
