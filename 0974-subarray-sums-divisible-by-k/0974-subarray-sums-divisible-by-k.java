class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        hm.put(0, 1);
        int presum = 0;
        int ans = 0;
        for(int i : nums){
            presum += i;
            int rem = presum % k;
            if(rem < 0) rem+=k;
            ans += hm.getOrDefault(rem, 0);
            hm.put(rem, hm.getOrDefault(rem, 0)+1);
        }
        return ans;
    }
}