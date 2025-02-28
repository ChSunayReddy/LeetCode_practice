n=list(map(int,input().split()))
k=int(input())
l=[]
for i in range(len(n)):
    for j in range(len(n)):
        if i<j:
            if n[i]+n[j]==k:
                l.append((i,j))
print(*l)
# class Solution:
#     def twoSum(self, n: List[int], target: int) -> List[int]:
#         nums = [(num, i) for i, num in enumerate(n)]
#         nums.sort(key=lambda x: x[0])
#         l=0
#         h=len(nums)-1
#         while(l<h):
#             sum=nums[l][0]+nums[h][0]
#             if sum==target:
#                 return [nums[l][1],nums[h][1]]
#                 break
#             elif sum>target:
#                 h-=1
#             else:
#                 l+=1
#         return []