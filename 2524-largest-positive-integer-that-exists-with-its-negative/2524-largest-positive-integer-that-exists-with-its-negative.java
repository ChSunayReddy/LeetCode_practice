class Solution {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int l=0,r=n-1;
        while(l<r){
            int m=Math.abs(nums[l]);
            if(m==nums[r] && nums[l]<0){
                return m;
            }
            else if(m<nums[r]){
                r--;
            }
            else{
                l++;
            }
        }
        return -1;
    }
}