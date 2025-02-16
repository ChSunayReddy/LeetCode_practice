class Solution:
    def getMaximumXor(self, nums, maximumBit):
        n=len(nums)
        l=[]
        mb=(1<<maximumBit)-1
        for i in nums:
            l.append(mb^i)
            mb=mb^i
        l.reverse()
        return l
s=Solution()
n=[0,1,1,3]
MaxBit=2
print(s.getMaximumXor(n,MaxBit))