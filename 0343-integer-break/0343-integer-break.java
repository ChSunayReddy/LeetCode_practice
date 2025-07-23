class Solution {
    public int integerBreak(int n) {
        if(n==2 || n==3) return n-1;
        int[] dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            for(int j=1;j<i;j++){
                int max=Math.max(j*(i-j),(j*dp[i-j]));
                dp[i]=Math.max(dp[i],max);
            }
        }
        return dp[n];
        // int res=1;
        // while(n>4){
        //     n-=3;
        //     res*=3;
        // }
        // return n*res;
    }
}