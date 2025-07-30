class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];
        Arrays.fill(dp,1);
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]) dp[i]=Math.max(dp[j]+1,dp[i]);
            }
        } 
        int max=Integer.MIN_VALUE;
        for(int i:dp) max=Math.max(max,i);
        return max;
    }
}