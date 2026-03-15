class Solution:
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