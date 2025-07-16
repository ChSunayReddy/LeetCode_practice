class Solution {
    public int maximumLength(int[] nums) {
        int n=nums.length;
        if(n==1) return 1;
        int[][] dp=new int[2][2];
        int maxl=1;
        for(int i:nums){
            int par=i%2;
            for(int pre=0;pre<2;pre++){
                int y=(pre-par+2)%2;
                dp[par][y]=dp[y][par]+1;
                maxl=Math.max(maxl,dp[par][y]);
            }
        }
        return maxl;
    }
}