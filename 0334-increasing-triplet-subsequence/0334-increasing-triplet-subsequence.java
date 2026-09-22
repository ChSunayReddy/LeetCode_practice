class Solution {
    public boolean increasingTriplet(int[] nums) {
        if (nums == null || nums.length < 3) return false;

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                first = num;           // found a new smallest "start"
            } else if (num <= second) {
                second = num;          // found a new smallest valid "middle"
            } else {
                return true;           // num > second > first → triplet found!
            }
        }

        return false;
    }
}