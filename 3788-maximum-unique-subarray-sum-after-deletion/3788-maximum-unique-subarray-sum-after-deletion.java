class Solution {
    public int maxSum(int[] nums) {
        int max=Integer.MIN_VALUE;
        boolean alln=true;
        for(int i:nums){
            if(i>=0){
                alln=false;
            }
            max=Math.max(max,i);
        }
        if(alln) return max;
        boolean[] seen =new boolean[101];
        for(int i:nums){
            if(i>=0 && i<101) seen[i]=true;
        }
        int sum=0;
        for(int i=1;i<101;i++){
            if(seen[i]) sum+=i;
        }
        return sum;
    }
}