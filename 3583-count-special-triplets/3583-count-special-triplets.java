class Solution {
    public int specialTriplets(int[] nums) {
        int n=nums.length;
        long c=0;
        int MOD = 1000000007;
        int maxl = 200001;
        int[] pref = new int[maxl];
        int[] nextf = new int[maxl];
        for(int i:nums){
            nextf[i]++;
        }
        for(int j=0;j<n;j++){
            nextf[nums[j]]--;
            int lc = pref[2*nums[j]];
            int rc = nextf[2*nums[j]];
            c=(c+(long)lc*rc)%MOD;
            pref[nums[j]]++;
        }
        return (int)c;
    }
}