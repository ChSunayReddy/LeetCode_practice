class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] ans = new int[n];
        for(int i=0;i<n;i++){
            boolean c = false; 
            if(i==n-1) ans[i] = prices[i];
            for(int j=i+1;j<n;j++){
                if(j>i && prices[j]<=prices[i]){
                    ans[i] = prices[i] - prices[j];
                    c= true;
                    break;
                }
            }
            if(!c) ans[i] = prices[i];
        }
        return ans;
    }
}