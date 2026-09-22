class Solution {
    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        if(n<3) return false;
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for(int x:nums){
            if(x > second) return true;
            else if(x > first){
                second = x;
            }
            else if(first > x){
                first = x;
            }
        }
        return false;
    }
}