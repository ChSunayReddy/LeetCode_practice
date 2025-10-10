class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        int n=nums.length;
        int tc=0;
        int[] pre=new int[n+1];
        int sum=0;
        pre[0]=1;
        for(int i=0;i<n;i++){
            sum+=nums[i];
            if(sum>=goal){
                tc+=pre[sum-goal];
            }
            pre[sum]++;
        }
        return tc;
    }
}