class Solution {
    public int minimumCost(int[] nums) {
        int freq[] = new int[51];
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            freq[nums[i]]++;
        }
        int res = nums[0];
        freq[nums[0]]--;
        int count = 1;
        for (int i = 1; i <= 50; i++) {
            if (count == 3)
                break;
            while (freq[i] > 0 && count < 3) {
                freq[i]--;
                count++;
                res += i;
            }
        }
        return res;
    }
}