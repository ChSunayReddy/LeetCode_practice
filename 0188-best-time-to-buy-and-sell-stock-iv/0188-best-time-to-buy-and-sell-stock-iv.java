class Solution {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;
        if(k>=n/2){
            int maxp = 0;
            for(int i=1;i<n;i++){
                int diff = prices[i]-prices[i-1];
                if(diff>0) maxp+=diff;
            }
            return maxp;
        }
        int[][] dp = new int[k+1][n];
        int localmax = Integer.MIN_VALUE;
        for(int i=1;i<=k;i++){
            for(int j=1;j<n;j++){
                localmax = Math.max(localmax,dp[i-1][j-1]-prices[j-1]);
                dp[i][j] = Math.max(dp[i][j-1], localmax+prices[j]);
            }
            localmax = Integer.MIN_VALUE;
        }
        return dp[k][n-1];
    }
}