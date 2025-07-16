class Solution {
    public int deleteAndEarn(int[] nums) {
        int n=nums.length;
        if(nums==null) return 0;
        int max=0;
        HashMap<Integer,Integer> pm=new HashMap<>();
       
        for(int i:nums){
            pm.put(i,pm.getOrDefault(i,0)+i);
            if(i>max) max=i;
        }
         int[] dp=new int[max+1];
        dp[0]=0;
        dp[1]=pm.getOrDefault(1,0);
        for(int i=2;i<max+1;i++){
            int gain=pm.getOrDefault(i,0);
            dp[i]=Math.max(dp[i-1],dp[i-2]+gain);
        }
        return dp[max];
    }
}