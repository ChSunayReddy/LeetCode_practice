class Solution {
    public int longestSubarray(int[] nums) {
        int l=0,zc=0,max=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0) zc++;
            while(zc>1){
                if(nums[l]==0) zc--;
                l++;
            }
            max=Math.max(max,i-l);
        }
    return max;
    }
}