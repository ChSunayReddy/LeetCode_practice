class Solution:
    def isPalindrome(self, x: int) -> bool:
        if x<0:
            return "Not possible if a number is negative"
        else:
            t=x
            rev=0
            while x>0:
                d=x%10
                rev=rev*10+d
                x//=10
            if rev==t:
                return "Palindromic Number"
            else:
                return "Not a Palindromic Number"
n=int(input())
g=Solution()
print(g.isPalindrome(n))