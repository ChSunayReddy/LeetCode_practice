class Solution {
    public long getDescentPeriods(int[] prices) {
        int n=prices.length,l=1;
        long ans=1;
        for(int r=1;r<n;r++){
            if(prices[r-1]-prices[r]==1){
                l++;
            }
            else{
                l=1;
            }
            ans+=l;
        }
        return ans;
    }
}