'''class Solution:
    def isValid(self, s: str) -> bool:
        ob = ['{', '(', '[']
        cb = ['}', ')', ']']
        dict= {')': '(', '}': '{', ']': '['}
        stack = []

        for i in s:
            if i in ob:
                stack.append(i)
            elif i in cb:
                if stack and stack[-1] == dict[i]:
                    stack.pop()
                else:
                    return False
            else:
                return False  

        return len(stack) == 0
s=input()
g=Solution()
print(g.isValid(s))'''
ob = ['{', '(', '[']
cb = ['}', ')', ']']
l=[]
s=input()
m=s.count(ob[0])
n=s.count(ob[1])
o=s.count(ob[2])
p=s.count(cb[0])
q=s.count(cb[1])
r=s.count(cb[2])
if m==p and n==q and o==r:
    print("Balnaced")
else:
    print("Unbalanced")