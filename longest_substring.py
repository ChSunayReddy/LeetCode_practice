class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        cim={}
        start=0
        max_length=0
        for i in range(len(s)):
            if s[i] in cim and cim[s[i]]>=start:
                start=cim[s[i]]+1
            cim[s[i]]=i
            max_length=max(max_length,i-start+1)
        return max_length
s=input()
b=Solution()
print(b.lengthOfLongestSubstring(s))