class Solution:
    def convert(self, s: str, n: int) -> str:
        if n == 1:
            return s

        rows = [""] * n
        
        add = 0
        inc = 1
        for i in s:
            rows[add] += i
            if add == 0:
                inc = 1
            elif add == n - 1:
                inc = -1
            add += inc
            
        return "".join(rows)
s=input()
n=int(input())
g=Solution()
print(g.convert(s,n))