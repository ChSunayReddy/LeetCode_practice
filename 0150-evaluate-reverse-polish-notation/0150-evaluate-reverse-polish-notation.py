class Solution:
    def evalRPN(self, tokens: List[str]) -> int:
        l=[]
        for i in tokens:
            if i in "+-*/":
                a=l.pop()
                b=l.pop()
                if i=="+":
                    l.append(a+b)
                elif i=="-":
                    l.append(b-a)
                elif i=="*":
                    l.append(b*a)
                elif i=="/":
                    l.append(int(b/a))
            else:
                l.append(int(i))
        return l.pop()
    # def isoperand(i):
    #     return "+-*/".contains(i)