class Solution {
    public int maximumLength(int[] nums, int k) {
        int n=nums.length;
        if(n==1) return 1;
        int[][] dp=new int[k][k];
        int maxl=1;
        for(int i:nums){
            int par=i%k;
            for(int pre=0;pre<k;pre++){
                int y=(pre-par+k)%k;
                dp[par][y]=dp[y][par]+1;
                maxl=Math.max(maxl,dp[par][y]);
            }
        }
        return maxl;
    }
}