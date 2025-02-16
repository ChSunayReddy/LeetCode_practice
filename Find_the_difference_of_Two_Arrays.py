class Solution:
    def findDifference(self, nums1,nums2):
        set1 = set(nums1)
        set2 = set(nums2)
        return [list(set1 - set2), list(set2 - set1)]
s=Solution()
num1=[1,2,3]
num2=[2,4,6]
print(s.findDifference(num1,num2))
