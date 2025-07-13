class Solution {
    public int longestOnes(int[] nums, int k) {
        int s=0,e=0,ml=0,r=0;
        while(e<=nums.length-1){
            if(nums[e]==1) r++;
            while(e-s+1-r>k){
                if(nums[s]==1) r--;
                s++;
            }
            ml=Math.max(ml,e-s+1);
            e++;
        }
        return ml;
    }
}