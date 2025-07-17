class Solution {
    public double minimumAverage(int[] nums) {
        int n=nums.length;
        Arrays.sort(nums);
        int s=0,e=n-1;
        double max=Integer.MAX_VALUE;
        while(s<=e){
            double t=((double)nums[s]+(double)nums[e])/2;
            max=Math.min(t,max);
            s++;
            e--;
        }
        return max;
    }
}