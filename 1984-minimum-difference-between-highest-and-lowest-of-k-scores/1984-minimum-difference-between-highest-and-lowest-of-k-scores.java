class Solution {
    public int minimumDifference(int[] nums, int k) {
        if(nums.length==1) return 0;
        int n = nums.length;
        Arrays.sort(nums);
        int max=0;
        for(int i:nums) if(i>max) max=i;
        for(int i=0;i<n-k+1;i++){
            int diff = Math.abs(nums[i]-nums[i+k-1]);
            max = Math.min(max,diff);
        }
        return max;
    }
}