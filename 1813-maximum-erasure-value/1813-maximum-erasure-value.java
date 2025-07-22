class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int sum=0;
        int max=0;
        int l=0,n=nums.length;
        boolean[] seen=new boolean[10001];
        for(int i=0;i<n;i++){
            while(seen[nums[i]]){
                sum-=nums[l];
                seen[nums[l]]=false;
                l++;
            }
            sum+=nums[i];
            seen[nums[i]]=true;
            max=Math.max(sum,max);
        }
        return max;
    }
}