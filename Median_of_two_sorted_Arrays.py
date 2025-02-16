class Solution:
    def findMedianSortedArrays(self, nums1, nums2):
        # m=len(nums1)
        # n=len(nums2)
        # l=[]
        # for j in nums1:
        #     l.append(j)
        # for k in nums2:
        #     l.append(k)
        # s=sorted(l)
        # if len(s)%2==0:
        #     D=float((s[len(s)//2]+s[(len(s)//2)-1])/2)
        #     return format(D,".5f")
        # else:
        #     d=float(s[(len(s)-1)//2])
        #     return format(d,".5f")
        l=nums1+nums2
        s=sorted(l)
        if len(s)%2!=0:
            return s[(len(s)-1)//2]
        else:
            return (s[len(s)//2]+s[(len(s)//2)-1])/2
        # l=nums1+nums2
        # l.sort()
        # if len(l)%2==0:
        #     c=len(l)//2;
        #     return (l[c]+l[c-1])/2.0
        # else:
        #     return l[len(l)//2]
s=Solution()
n=[1,3]
m=[2]
print(s.findMedianSortedArrays(n,m))