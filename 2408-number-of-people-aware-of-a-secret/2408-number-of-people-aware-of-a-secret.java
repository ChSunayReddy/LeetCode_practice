class Solution {
    public int peopleAwareOfSecret(int n, int delay, int forget) {
        final int MOD = 1_000_000_007;
        if (n == 1) return 1;
        long[] dp = new long[n + 1];
        dp[1] = 1;
        long window = 0;
        for (int i = 2; i <= n; i++) {
            int enter = i - delay;
            int exit  = i - forget;
            if (enter >= 1) window = (window + dp[enter]) % MOD;
            if (exit  >= 1) window = (window - dp[exit] + MOD) % MOD;
            dp[i] = window;
        }
        long ans = 0;
        int start = Math.max(1, n - forget + 1);
        for (int i = start; i <= n; i++) ans = (ans + dp[i]) % MOD;
        return (int)ans;
        // int ans=1;
        // int[][] dp=new int[n+1][n+1];
        // for(int i=0;i<=n;i++){
        //     for(int j=0;j<=n;j++){
        //         if(j==0){
        //             int sum=0;
        //             for(int k=delay-1;k<forget-2;k++){
        //                 sum+=dp[i-1][j];
        //             }
        //             dp[i][j]=sum;
        //         }
        //         else if(j>0){
        //             dp[i][j]=dp[i-1][j-1];
        //         }
        //     }
        // }
        // return dp[n][n];
    }
}