class Solution {
    public boolean canPartition(int[] nums) {
        int tot=0;
        for(int i:nums) tot+=i;
        if(tot%2!=0) return false;
        int k=tot/2;
        boolean[] dp=new boolean[k+1];
        dp[0]=true;
        for(int n:nums){
            for(int i=k;i>=n;i--){
                if(dp[i]) continue;
                if(dp[i-n]) dp[i]=true;
                if(dp[k]) return true;
            }
        }
        return false;
    }
}