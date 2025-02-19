class Solution(object):
    def productExceptSelf(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        n=len(nums)
        l=[1]*n
        prefix=1
        for i in range(n):
            l[i]=prefix
            prefix*=nums[i]
        suffix=1
        for i in range(n-1,-1,-1):
            l[i]*=suffix
            suffix*=nums[i]
        return l
nums=list(map(int,input().split()))
n=Solution()
print(n.productExceptSelf(nums))