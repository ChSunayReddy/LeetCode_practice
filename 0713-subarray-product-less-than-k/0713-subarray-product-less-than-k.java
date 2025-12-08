class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;
        int n=nums.length,l=0,ans=0,cur=1;
        for(int r=0;r<n;r++){
            cur*=nums[r];
            while(cur>=k){
                cur/=nums[l];
                l++;
            }
            ans+=(r-l+1);
        }
        return ans;
    }
}