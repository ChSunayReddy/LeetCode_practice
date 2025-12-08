class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l=0,r=nums.length-1;
        while(l<r){
            int cur=nums[l]+nums[r];
            if(cur==target){
                return new int[]{l+1,r+1};
            }
            if(cur>target) r--;
            else l++;
        }
        return new int[]{-1,-1};
    }
}