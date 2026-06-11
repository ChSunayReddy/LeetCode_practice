class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        int n = nums.length;
        int l=0, r = n-1;
        while(l<=r){
            int mid = l + (r-l)/2;
            if(nums[mid]<min) min = nums[mid];
            if(nums[mid]<nums[r]) r--;
            else l++;
        }
        return min;
    }
}