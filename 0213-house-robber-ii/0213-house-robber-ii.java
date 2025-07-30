class Solution {
    public int rob(int[] nums) {
        int n =nums.length;
        int [] dp1 = new int[n];
        Arrays.fill(dp1,-1);
        int [] dp2 = new int[n];
        Arrays.fill(dp2,-1);
        return Math.max(robber(dp1,n-1,2,nums)+nums[0],robber(dp2,n,1,nums));
    }

    static int robber(int [] dp,int n,int i,int [] nums){
            if(i>=n){
                return 0;
            }
            if(dp[i]!=-1){
                return dp[i];
            }
            int  chori =nums[i]+robber(dp,n,i+2,nums);
            int nachori = robber(dp,n,i+1,nums);
            dp[i]=Math.max(chori,nachori);
            return dp[i];
    }
}