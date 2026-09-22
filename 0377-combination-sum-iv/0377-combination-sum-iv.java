class Solution {
    public int combinationSum4(int[] nums, int target) {
        int n = nums.length;
        int[] dp = new int[target+1];
        dp[0] = 1;
        for(int sum=1;sum<=target;sum++){
            for(int i : nums){
                if(sum>=i) dp[sum] += dp[sum - i];
            }
        }
        return dp[target];
    }
}