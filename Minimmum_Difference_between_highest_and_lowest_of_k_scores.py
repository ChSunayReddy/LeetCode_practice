from typing import List

class Solution:
    def minimumDifference(self, nums: List[int], k: int) -> int:
        # l=[]
        # if(len(nums)==1):
        #     return 0
        # m=max(nums)
        # nums.sort()
        # for i in range(len(nums)-k+1):
        #     d=abs(nums[i]-nums[i+k-1])
        #     m=min(m,d)
        # return m
        if len(nums) == 1 or k == 1:
            return 0
        
        nums.sort()
        m = float('inf')
        
        for i in range(len(nums) - k + 1):
            d = nums[i + k - 1] - nums[i]  # Difference between min and max in the window
            m = min(m, d)
        
        return m

# Main function to test the solution
if __name__ == "__main__":
    solution = Solution()

    # Test cases
    nums1, k1 = [9, 4, 1, 7], 2
    nums2, k2 = [1, 3, 6, 10, 15], 3
    nums3, k3 = [90], 1  # Edge case (single element)
    
    print("Test Case 1:", solution.minimumDifference(nums1, k1))  # Output: 2
    print("Test Case 2:", solution.minimumDifference(nums2, k2))  # Output: 3
    print("Test Case 3:", solution.minimumDifference(nums3, k3))  # Output: 0
