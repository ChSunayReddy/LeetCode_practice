from collections import Counter
from itertools import combinations
from math import comb
class Solution:
    def tupleSameProduct(self, nums):
        product_counts = Counter(a * b for a, b in combinations(nums, 2))
        return 8 * sum(comb(C, 2) for C in product_counts.values())
s=Solution()
nums = [2,3,4,6]
print(s.tupleSameProduct(nums))