class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int min=Integer.MAX_VALUE;
        int l=0,sum=0;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            while(sum>=target){
                min=Math.min(min,i-l+1);
                sum-=nums[l];
                l++;
            }
        }
        return min==Integer.MAX_VALUE ? 0 : min;
    }
}