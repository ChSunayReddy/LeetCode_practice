import math
class Solution(object):
    def gcdOfStrings(self, str1, str2):
        """
        :type str1: str
        :type str2: str
        :rtype: str
        """
        def gcd(a,b):
            while b:
                a,b=b,a%b
            return a
        l=gcd(len(str1),len(str2))
        s=str1[:l]
        if str1==s*(len(str1)//l) and str2==s*(len(str2)//l):
            return s
        else:
            return ""
s=Solution()
str1 = "ABCABC"
str2 = "ABC"
print(s.gcdOfStrings(str1,str2))