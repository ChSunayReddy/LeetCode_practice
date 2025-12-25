class Solution {
    public long maximumHappinessSum(int[] hap, int k) {
        long ans = 0;
        int n = hap.length,m=n-1,dec=0;
        Arrays.sort(hap);
        while(k>0 && m>=0){
            long val = hap[m]-dec;
            ans+=Math.max(0,val);
            dec++;
            m--;
            k--;
        }
        return ans;
    }
}