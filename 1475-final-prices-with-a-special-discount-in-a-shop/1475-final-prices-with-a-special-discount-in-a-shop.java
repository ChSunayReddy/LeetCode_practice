class Solution {
    public int[] finalPrices(int[] prices) {
        int n = prices.length;
        int[] ans = prices.clone();
        Deque<Integer> st = new ArrayDeque<>();
        for(int j=0;j<n;j++){
            while(!st.isEmpty() && prices[j]<=prices[st.peek()]) ans[st.pop()]-=prices[j];
            st.push(j);
        }
        return ans;
    }
}