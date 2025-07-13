class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0,m=0;
        for(int i:nums){
            if(i==1) m++;
            if(i==0) m=0;
            max=Math.max(max,m);
        }
        return max;
    }
}