class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        l=nums1+nums2
        l.sort()
        if len(l)%2==0:
            c=len(l)//2
            return (l[c]+l[c-1])/2.0
        else:
            return l[len(l)//2]