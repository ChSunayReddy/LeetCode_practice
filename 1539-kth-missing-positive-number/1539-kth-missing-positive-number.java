class Solution {
    public int findKthPositive(int[] arr, int k) {
        int i=0;
        int mis=0;
        int ans=1;
        while(mis<k){
            if(i<arr.length && arr[i]==ans){
                i++;
            }
            else{
                mis++;
            }
            if(mis==k) return ans;
            ans++;
        }
        return -1;
    }
}