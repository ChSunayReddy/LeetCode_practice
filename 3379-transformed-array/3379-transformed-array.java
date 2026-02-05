class Solution {
    public int[] constructTransformedArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]==0) ans[i]=0;
            else if(nums[i]>0){
                int ind = (i+nums[i]) % n;
                ans[i] = nums[ind];
            }
            else{
                int ind = (i+nums[i]) % n;
                if(ind<0) ind+=n;
                ans[i] = nums[ind];
            }
        }
        return ans;
    }
}