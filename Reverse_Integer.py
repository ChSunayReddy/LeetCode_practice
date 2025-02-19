class Solution:
    def reverse(self, x: int) -> int:
        # if x<0:
        #     a=x*-1
        #     s=0
        #     while a:
        #         f=a%10
        #         s=s*10+f
        #         x//=10
        #     return s*-1
        # elif x>0:
        #     s=0
        #     while x:
        #         a=x%10
        #         s=s*10+a
        #         x//=10
        #     return s
        upper_limit = (2 ** 31) -1
        is_negative = x < 0
        if is_negative:
            x = -x
        reverse = 0
        while x != 0:
            last_digit = x % 10
            if reverse > (upper_limit - last_digit) // 10:
                return 0
            reverse = reverse * 10 + last_digit
            x = x // 10
        if is_negative:
            reverse = -reverse
        return reverse
a=321
s=Solution()
print(s.reverse(a))