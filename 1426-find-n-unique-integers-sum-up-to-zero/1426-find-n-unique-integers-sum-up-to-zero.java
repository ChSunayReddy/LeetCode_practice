class Solution {
    public int[] sumZero(int n) {
        int[] ans=new int[n];
        int l=0,r=n-1;
        int num=n;
        while(l<r){
            ans[l++]=num;
            ans[r--]=-num;
            num--;
        }
        return ans;
    }
}