class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        int n=nums.length,res=0;
        int[] rem = new int[value];
        for(int i:nums){
            int r= ((i%value)+value)%value;
            rem[r]++;
        }
        while(rem[res%value]-->0) res++;
        return res;
    }
}