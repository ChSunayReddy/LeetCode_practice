class Solution:
    def pivotIndex(self, nums: List[int]) -> int:
        for i in range(len(nums)):
            l=nums[:i]
            r=nums[i+1:]
            if(sum(l)==sum(r)):
                return i
        return -1