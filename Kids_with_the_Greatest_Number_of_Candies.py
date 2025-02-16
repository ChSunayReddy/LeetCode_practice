class Solution(object):
    def kidsWithCandies(self, c, ec):
        """
        :type candies: List[int]
        :type extraCandies: int
        :rtype: List[bool]
        """
        m=max(c)
        l=[]
        for i in c:
            if i+ec>=m:
                l.append(True)
            else:
                l.append(False)
        return l
s=Solution()
candies = [2,3,5,1,3]
extraCandies = 3
print(s.kidsWithCandies(candies,extraCandies))