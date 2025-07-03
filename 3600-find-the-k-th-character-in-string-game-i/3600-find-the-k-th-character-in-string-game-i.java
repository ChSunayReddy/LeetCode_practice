class Solution {
    public char kthCharacter(int k) {
        int toadd=0;
        while(k>1){
            k=k-closesttwo(k-1);
            toadd++;
        }
        return (char)('a'+toadd);
    }
    public int closesttwo(int n){
        int ans=1;
        while(ans<<1 <=n){
            ans=ans<<1;
        }
        return ans;
    }
}