class Solution {
    public int[] getNoZeroIntegers(int n) {
        int[] ans=new int[2];
        for(int i=1;i<=n;i++){
            int a=i;
            int b=n-i;
            if(!con(a) && !con(b) && a!=0 && b!=0){
                ans[0]=a;
                ans[1]=b;
            }
        }
        return ans;
    }
    public boolean con(int a){
        while(a>0){
            int rem=a%10;
            if(rem==0) return true;
            a/=10;
        }
        return false;
    }
}